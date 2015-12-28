package com.myapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mithun on 27/12/15.
 */
public class Song implements Parcelable {

    public int i;
    public String sum;

    protected Song(Parcel in) {
        i = in.readInt();
        sum = in.readString();
    }
    public Song(int io, String toy){
        i=io;
        sum=toy;
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(i);
        dest.writeString(sum);
    }
}
