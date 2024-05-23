package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes2.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f7453a = (AudioAttributes) versionedParcel.m11145r(audioAttributesImplApi21.f7453a, 1);
        audioAttributesImplApi21.f7454b = versionedParcel.m11143p(audioAttributesImplApi21.f7454b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.m11151x(false, false);
        versionedParcel.m11125H(audioAttributesImplApi21.f7453a, 1);
        versionedParcel.m11123F(audioAttributesImplApi21.f7454b, 2);
    }
}
