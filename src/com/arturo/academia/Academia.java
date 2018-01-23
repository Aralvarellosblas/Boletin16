package com.arturo.academia;


import com.arturo.persoal.Persoal;

/**
 *
 * @author Arturo
 */
public class Academia {
    private static int numReferencia=2018;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academia(){
        numReferencia++;
    }

    public Academia(String nome, int nota, Persoal alumno){
        numReferencia++;
        this.nome=nome;
        this.nota=nota;
        this.alumno=alumno;
    }

    public int getNumReferencia(){
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia){
        this.numReferencia=numReferencia;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota=nota;
    }

    public Persoal getAlumno(){
        return alumno;
    }

    public void setAlumno(Persoal alumno){
        this.alumno=alumno;
    }
    @Override
    public String toString(){
        return("Numero de referencia: "+numReferencia+"\nNombre: "+nome+"\nNota: "+nota+"\nDatos alumno: "+alumno.toString());
    }
}
