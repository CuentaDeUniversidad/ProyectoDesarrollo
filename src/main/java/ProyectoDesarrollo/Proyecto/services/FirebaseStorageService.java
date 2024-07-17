/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProyectoDesarrollo.Proyecto.services;


import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente,
            String carpeta,
            Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "zapatodeluxe.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "zapatodeluxe";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "zapatodeluxe-firebase-adminsdk-o5yxw-df64db6426.json";
}

