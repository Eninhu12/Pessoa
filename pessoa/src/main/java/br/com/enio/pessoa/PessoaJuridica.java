package br.com.enio.pessoa;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String documento){
		super(documento);
	}

	@Override
	public Boolean validarDocumento() {
		if(14==super.getDocumento().length()) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDocumentoValidado() {
		// TODO Auto-generated method stub
		return null;
	}

}
