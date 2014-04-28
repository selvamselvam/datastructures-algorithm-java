package com.datastructure.hash;

public class Item {
	 private String key;
	    private Object element;

	    public Item(String key, Object element) {

	        this.setKey(key);
	        this.setElement(element);
	    }

	    public String key() {
	        return key;
	    }

	    public void setKey(String key) {
	        this.key = key;
	    }

	    public Object element() {
	        return element;
	    }

	    public void setElement(Object element) {
	        this.element = element;
	    }

	    public String toString() {

	        String s = "<Item(";
	        s += this.key() + "," + this.element() + ")>";
	        return s;
	    }
}
