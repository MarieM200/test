package test;

public class EntierNat {
	static int n;
	
	public EntierNat(int n) throws ErrConst {
		// TODO Auto-generated constructor stub
		EntierNat.n = n;
		if(n<0) {
			throw new ErrConst("L'entier doit etre >= 0") ;
		}
	}
	
	public static int getN() {
		return n;
	}

	public static int somme(int a) throws ErrS {
		if(n+a>Integer.MAX_VALUE || n+a<0) {
			throw new ErrS("L'entier doit etre >= 0 et < max_value de int") ;
		}
		return n + a;
	}
	
	public static int difference(int a) throws ErrD {
		if(n-a>Integer.MAX_VALUE || n-a<0) {
			throw new ErrD("L'entier doit etre >= 0 et < max_value de int") ;
		}
		return n - a;
	}
	
	public static int produit(int a) throws ErrP {
		if(n*a>Integer.MAX_VALUE || n*a<0) {
			throw new ErrP("L'entier doit etre >= 0 et < max_value de int") ;
		}
		return n * a;
	}
	
	
}
