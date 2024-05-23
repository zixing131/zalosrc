package p270jk;

import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19074t;
import i40.C20275e;

/* renamed from: jk.a */
/* loaded from: classes3.dex */
public final class C21280a {

    /* renamed from: a */
    private final MediaItem f103704a;

    /* renamed from: b */
    private final AnimationTarget f103705b;

    /* renamed from: c */
    private final int f103706c;

    /* renamed from: d */
    private final C20275e f103707d;

    /* renamed from: e */
    private final String f103708e;

    /* renamed from: f */
    private final String f103709f;

    public C21280a(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e, String str, String str2) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        AbstractC19074t.m100208f(str, "msgSnackBar");
        AbstractC19074t.m100208f(str2, "paramLogMediaItemOverSize");
        this.f103704a = mediaItem;
        this.f103705b = animationTarget;
        this.f103706c = i11;
        this.f103707d = c20275e;
        this.f103708e = str;
        this.f103709f = str2;
    }

    /* renamed from: a */
    public final C20275e m110222a() {
        return this.f103707d;
    }

    /* renamed from: b */
    public final AnimationTarget m110223b() {
        return this.f103705b;
    }

    /* renamed from: c */
    public final MediaItem m110224c() {
        return this.f103704a;
    }

    /* renamed from: d */
    public final String m110225d() {
        return this.f103708e;
    }

    /* renamed from: e */
    public final String m110226e() {
        return this.f103709f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21280a)) {
            return false;
        }
        C21280a c21280a = (C21280a) obj;
        return AbstractC19074t.m100204b(this.f103704a, c21280a.f103704a) && AbstractC19074t.m100204b(this.f103705b, c21280a.f103705b) && this.f103706c == c21280a.f103706c && AbstractC19074t.m100204b(this.f103707d, c21280a.f103707d) && AbstractC19074t.m100204b(this.f103708e, c21280a.f103708e) && AbstractC19074t.m100204b(this.f103709f, c21280a.f103709f);
    }

    /* renamed from: f */
    public final int m110227f() {
        return this.f103706c;
    }

    public int hashCode() {
        int hashCode = this.f103704a.hashCode() * 31;
        AnimationTarget animationTarget = this.f103705b;
        int hashCode2 = (((hashCode + (animationTarget == null ? 0 : animationTarget.hashCode())) * 31) + this.f103706c) * 31;
        C20275e c20275e = this.f103707d;
        return ((((hashCode2 + (c20275e != null ? c20275e.hashCode() : 0)) * 31) + this.f103708e.hashCode()) * 31) + this.f103709f.hashCode();
    }

    public String toString() {
        return "MediaItemClickParam(mediaItem=" + this.f103704a + ", animationTarget=" + this.f103705b + ", position=" + this.f103706c + ", animationController=" + this.f103707d + ", msgSnackBar=" + this.f103708e + ", paramLogMediaItemOverSize=" + this.f103709f + ")";
    }
}
