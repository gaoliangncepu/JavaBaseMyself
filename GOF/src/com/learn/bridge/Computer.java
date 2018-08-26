package com.learn.bridge;

public interface Computer {
	void sale();
}

class Desktop implements Computer {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("taishiji");
	}
}

class Laptop implements Computer {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("bijiben");
	}
}

class Pad implements Computer {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("pad");
	}
}

class LenovoDesktop extends Desktop {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Lenovo Desktop sell");
	}
}
class DellDesktop extends Desktop {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Dell Desktop sell");
	}
}
class ShenzhouDesktop extends Desktop {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Shenzhou Desktop sell");
	}
}

class LenovoLaptop extends Laptop {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Lenovo Laptop sell");
	}
}
class DellLaptop extends Laptop {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Dell Laptop sell");
	}
}
class ShenzhouLaptop extends Laptop {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Shenzhou Laptop sell");
	}
}

class LenovoPad extends Pad {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Lenovo Pad sell");
	}
}
class DellPad extends Pad {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Dell Pad sell");
	}
}
class ShenzhouPad extends Pad {
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("Shenzhou Pad sell");
	}
}