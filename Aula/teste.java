
for(int i=0; i<=v.lenght; i++){
    if(this.getEnergia() < v[i].getEnergia()){
        if(this.getX() == v[i].getX() && this.getY == v[i].getY()){
            int cont++;
        }
            
    
    }
}
if(cont>=5){
    return true;
}
/*this.getX() == v[i].getX() &&
this.getY() == v[i].getY())*/

