class Person implements Cloneable{
    public int age;

    Money m = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Person p = (Person)super.clone();
        p.m = (Money)this.m.clone();
        return p;
    }
}
