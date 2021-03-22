package com.example.imageloader;

import android.os.Parcel;
import android.os.Parcelable;

public class ImageP implements Parcelable {

    private String mUrl;

    public ImageP(String url) {
        this.mUrl = url;
    }

    public ImageP() {

    }

    public String getmUrl() {
        return mUrl;
    }

    protected ImageP(Parcel in) {
        mUrl = in.readString();
    }

    public static final Creator<ImageP> CREATOR = new Creator<ImageP>() {
        @Override
        public ImageP createFromParcel(Parcel in) {
            return new ImageP(in);
        }

        @Override
        public ImageP[] newArray(int size) {
            return new ImageP[size];
        }
    };

    public ImageP[] getImage() {
        return new ImageP[] {
                new ImageP("https://i.pinimg.com/originals/ab/b6/a8/abb6a800ab2193fcedd9bda566b7402c.jpg"),
                new ImageP("https://javasea.ru/uploads/posts/2020-08/1597924857_profil-mordy-tigra-vo-tme2.jpg"),
                new ImageP("https://static.wixstatic.com/media/79c9822b89594184828440001e15fc21.jpg/v1/fill/w_640,h_560,al_c,q_80,usm_0.66_1.00_0.01/79c9822b89594184828440001e15fc21.webp"),
                new ImageP("https://lh3.googleusercontent.com/proxy/58xuL5XG2983T2ScDa8xKUjYfHYfkGtHFi7Jb7sUO5PohQOP7mxxgNSI2NYFelh7yw8fKm9-apBbD5Mkc6t_EWr7J-XmV_jQm6DmwvgsGwEJ4rSGcPmPgHgXrmr2ndLomiSy7Rg2"),
                new ImageP("https://vjoy.cc/wp-content/uploads/2019/10/2-7.jpg"),
                new ImageP("https://klike.net/uploads/posts/2019-01/1547366815_1.jpg"),
                new ImageP("https://avatarko.ru/img/kartinka/2/cherep_kapyushon_uzhasy_1606.jpg"),
                new ImageP("https://static7.depositphotos.com/1314241/789/i/600/depositphotos_7890698-stock-photo-ferocious-lion.jpg"),
                new ImageP("https://vypechka-online.ru/wp-content/uploads/2019/09/d12d35ae1ebc70bae05f22c76ca442c3.jpg"),
                new ImageP("https://lh3.googleusercontent.com/proxy/lrtkxAe7mblUm4ovnFzqwzYgEORIZ8DAETwBraljxN3NOmVaG-XY6XeEmOBbqA1hp_GypJC6BohmxJsnCx8ZO3EmG79_GOBQsyP9kWJQv82vxlNCJVwrpPWhQdwOC104_EU9wXS-HqryePrLwyvqidoF0Avzsg"),
                new ImageP("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLSlyO6ea9vAtMM3mCGv7eho-lhpNxwXEPvQ&usqp=CAU"),
                new ImageP("https://pictureholiday.ru/wp-content/uploads/2018/05/e77d3da8e42f0eb.jpg"),
                new ImageP("https://bipbap.ru/wp-content/uploads/2017/04/000000843.jpg"),
                new ImageP("https://artemvm.info/upload/artemvm.info/information_system_38/3/9/5/item_3958/small_item_3958.jpg?v=100"),
                new ImageP("https://img51994.muz1.tv/img/2016-11-07/fmt_89_24_oblozhka.jpeg"),
                new ImageP("https://images.wallpaperscraft.ru/image/paraplan_nebo_polet_91710_225x300.jpg")

        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mUrl);
    }
}
