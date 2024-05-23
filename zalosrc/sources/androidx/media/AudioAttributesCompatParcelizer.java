package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes2.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f7452a = (AudioAttributesImpl) versionedParcel.m11149v(audioAttributesCompat.f7452a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.m11151x(false, false);
        versionedParcel.m11130M(audioAttributesCompat.f7452a, 1);
    }
}
