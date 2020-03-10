/**
 * @author wangz
 */
public interface Open {
    void open();
}

class openTV implements Open {
    private Tv tv;
    public openTV(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void open() {
        this.tv.play();
    }
}

class openTV2 implements Open {
    private Tv tv;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}


class Test {
    public static void main(String[] args) {
    }
}