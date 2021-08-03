package br.com.enio.pessoa;

import java.util.SplittableRandom;

public class PessoaFisica extends Pessoa {
	
	public PessoaFisica(String documento){
		super(documento);
	}
	
	@Override
	public Boolean validarDocumento() {
		if(10==super.getDocumento().length()) {
			char[] c = super.getDocumento().toCharArray();
			String c1 = String.valueOf(c[8]);
			Integer v1 = Integer.parseInt(c1);
			String c2 = String.valueOf(c[7]);
			Integer v2 = Integer.parseInt(c2);
			String c3 = String.valueOf(c[6]);
			Integer v3 = Integer.parseInt(c3);
			String c4 = String.valueOf(c[5]);
			Integer v4 = Integer.parseInt(c4);
			String c5 = String.valueOf(c[4]);
			Integer v5 = Integer.parseInt(c5);
			String c6 = String.valueOf(c[3]);
			Integer v6 = Integer.parseInt(c6);
			String c7 = String.valueOf(c[2]);
			Integer v7 = Integer.parseInt(c7);
			String c8 = String.valueOf(c[1]);
			Integer v8 = Integer.parseInt(c8);
			String c9 = String.valueOf(c[0]);
			Integer v9 = Integer.parseInt(c9);
			String c10 = String.valueOf(c[9]);
			String c11 = String.valueOf(c[10]);
			String c12 = c10+c11;
			Integer v10 = Integer.parseInt(c12);
			Integer Soma = (v1*9)+(v2*8)+(v3*7)+(v4*6)+(v5*5)+(v6*4)+(v7*3)+(v8*2)+(v9*1);
				if(Soma%11==v10) {
					return true;
				}
				else {
					return false;
				}
		}
		else {
		return false;
		}
	}

	@Override
	public String gerarDocumento() {
		SplittableRandom a = new SplittableRandom();
		String CPF = null;
		String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
		for(int i=0;i<10;i++) {
			CPF=CPF+numeros[a.nextInt(0,numeros.length)];
		}
		return CPF;
	}

	@Override
	public String getDocumentoValidado() {
		char[] validado = null;
		String doc = gerarDocumento();
		char[] docc=doc.toCharArray();
		validado[0]=docc[0];
		validado[1]=docc[1];
		validado[2]=docc[2];
		validado[3]='.';
		validado[4]=docc[3];
		validado[5]=docc[4];
		validado[6]=docc[5];
		validado[7]='.';
		validado[8]=docc[6];
		validado[9]=docc[7];
		validado[10]=docc[8];
		validado[11]='-';
		validado[12]=docc[9];
		validado[13]=docc[10];
		String validado1 = String.valueOf(validado);
		return validado1;
	}

}
