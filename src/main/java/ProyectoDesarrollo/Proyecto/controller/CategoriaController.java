package ProyectoDesarrollo.Proyecto.controller;

import ProyectoDesarrollo.Proyecto.domain.Categoria;
import ProyectoDesarrollo.Proyecto.services.CategoriaService;
import ProyectoDesarrollo.Proyecto.services.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias", lista);
        model.addAttribute("totalCategorias", lista.size());

        return "/categoria/listado";

    }

    @Autowired
    private FirebaseStorageService firebaseStorageService;

    @PostMapping("guardar")
    public String guardar(Categoria categoria,
            @RequestParam("imagenFile") MultipartFile imagenFile) {

        if (!imagenFile.isEmpty()) {// vamos a subir una imagen.
            categoriaService.save(categoria);
            String rutaImagen = firebaseStorageService.cargaImagen(imagenFile,
                    "categoria", categoria.getIdCategoria());
            categoria.setRutaImagen(rutaImagen);
        }
        categoriaService.save(categoria);

        return "redirect:/categoria/listado";
    }

    @GetMapping("/eliminar/{idCategoria}")
    public String eliminar(Categoria categoria) {
        categoriaService.delete(categoria);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/modificar/{idCategoria}")
    public String modificar(Categoria categoria, Model model) {
        categoria = categoriaService.getCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "/categoria/modifica";
    }
}
