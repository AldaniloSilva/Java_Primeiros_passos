package primeiro_passo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriell
 */
public enum EnumEstadoConsole {
    
    APP_MENU(new MenuPrincipal()),
    APP_TABUADA(new EstadoTabuada()), 
    APP_CADASTRO(new EstadoCadastro());
    
    private final MaquinaEstadoConsole classe;
    
    
    EnumEstadoConsole( MaquinaEstadoConsole classe){
        this.classe = classe;
    }
    
    public MaquinaEstadoConsole getClasse(){
        return this.classe;
    }
}
