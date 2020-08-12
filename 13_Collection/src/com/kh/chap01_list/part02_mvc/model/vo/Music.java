package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> { //Comparable<제네릭 설정 가능!>

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
	
		// 가수명 오름차순 정렬 되게끔 해주자!
		
		// 이 compareTo 메소드 반환값이 양수일 경우 두 객체의 순서가 뒤바뀜!
		
		// m1.compareTo(m2)
		// this(앞)		o(뒤)
		
		// this(앞)의 가수명이 o(뒤)의 가수명보다 큰값일 경우 순서 변경 ==> 양수값 반환(양수여야 자리가 바뀌기 때문에)
		
		/*
		 * if(this.artist > o.getArtist()) { return 1; }else { return 0 또는 -1; }
		 */
		
		// 문자열간에 대소비교를 해주는 String 클래스에서 제공하는
		// 앞쪽 문자열.compareTO(뒷쪽 문자열)
		// 앞쪽 문자열 > 뒷쪽 문자열 => 1반환 / 작으면 -1 반환 / 일치하면 0반환
		
		
		// 하지만 이것은 정렬 기준이 한개밖에 못만든다!
		return this.artist.compareTo(o.getArtist());
	}

	
}	
