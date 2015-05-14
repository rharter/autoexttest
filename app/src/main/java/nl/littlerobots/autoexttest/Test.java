package nl.littlerobots.autoexttest;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Test implements Parcelable {
    public abstract String name();
}
