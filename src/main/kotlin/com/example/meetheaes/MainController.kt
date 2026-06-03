package com.example.meetheaes

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class MainController (){
        /** @TODO refaire la doc ici
         * Méthode permettant d'afficher la page d'accueil de l'application.
         * @return le chemin vers le template a partir du dossier ressources/templates (on ne marque pas le .html)
         */
        @GetMapping("/meetheaes")
        fun home():String{
            return "index"
        }


}

