class Infantaria extends Unidade implements Combativel { 
    public void caminha(); 
}
class Trabalhador extends Unidade { 
    public void executaTarefa(); 
}
class Arqueiro extends Infantaria { 
    public void atiraFlecha(); 
}
class Cavaleiro extends Infantaria { 
    public void cavalga(); 
}
class Bombeiro extends Infantaria { 
    public void explode();
}
class Ferraria extends Construcao { 
    public void carrega(); 
}
class Quartel extends Construcao { 
    public void treina();
}
    

