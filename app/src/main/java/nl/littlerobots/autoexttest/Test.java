package nl.littlerobots.autoexttest;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Test implements Parcelable {
    public abstract String name();
    public abstract long pushups();
    public abstract long time();

    public double pushupsOverTime() {
      return pushups() / time();
    }
    
    public abstract Builder toBuilder();

    @AutoValue.Builder
    public interface Builder {
      Builder name(String name);
      Builder pushups(long pushups);
      Builder time(long time);
      Test build();
    }
}
