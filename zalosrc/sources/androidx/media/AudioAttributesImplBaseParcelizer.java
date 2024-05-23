package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes2.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f7455a = versionedParcel.m11143p(audioAttributesImplBase.f7455a, 1);
        audioAttributesImplBase.f7456b = versionedParcel.m11143p(audioAttributesImplBase.f7456b, 2);
        audioAttributesImplBase.f7457c = versionedParcel.m11143p(audioAttributesImplBase.f7457c, 3);
        audioAttributesImplBase.f7458d = versionedParcel.m11143p(audioAttributesImplBase.f7458d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.m11151x(false, false);
        versionedParcel.m11123F(audioAttributesImplBase.f7455a, 1);
        versionedParcel.m11123F(audioAttributesImplBase.f7456b, 2);
        versionedParcel.m11123F(audioAttributesImplBase.f7457c, 3);
        versionedParcel.m11123F(audioAttributesImplBase.f7458d, 4);
    }
}
