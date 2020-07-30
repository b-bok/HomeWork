package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> { //Comparable<���׸� ���� ����!>

	private String title;
	private String artist;
	
	public Music() {}
	
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
	
		// ������ �������� ���� �ǰԲ� ������!
		
		// �� compareTo �޼ҵ� ��ȯ���� ����� ��� �� ��ü�� ������ �ڹٲ�!
		
		// m1.compareTo(m2)
		// this(��)		o(��)
		
		// this(��)�� �������� o(��)�� �������� ū���� ��� ���� ���� ==> ����� ��ȯ(������� �ڸ��� �ٲ�� ������)
		
		/*
		 * if(this.artist > o.getArtist()) { return 1; }else { return 0 �Ǵ� -1; }
		 */
		
		// ���ڿ����� ��Һ񱳸� ���ִ� String Ŭ�������� �����ϴ�
		// ���� ���ڿ�.compareTO(���� ���ڿ�)
		// ���� ���ڿ� > ���� ���ڿ� => 1��ȯ / ������ -1 ��ȯ / ��ġ�ϸ� 0��ȯ
		
		
		// ������ �̰��� ���� ������ �Ѱ��ۿ� �������!
		return this.artist.compareTo(o.getArtist());
	}

	
}	
