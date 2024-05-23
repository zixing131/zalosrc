package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes2.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f7453a;

    /* renamed from: b */
    int f7454b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f7453a.equals(((AudioAttributesImplApi21) obj).f7453a);
    }

    public int hashCode() {
        return this.f7453a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f7453a;
    }
}
