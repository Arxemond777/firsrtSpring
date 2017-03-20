package ch5_AOP.page_280_aspectJ_aspects;

public aspect MessageWrapper
{
    private String prefix;
    private String suffix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    pointcut doWriting():
            execution(*
                    ch5_AOP.page_280_aspectJ_aspects.MessageWriter.writeMessage());

    before(): doWriting() {
        System.out.println(prefix);
    }

    after(): doWriting() {
        System.out.println(suffix);
    }
}
