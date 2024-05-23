package gs;

import com.zing.zalo.data.mediapicker.model.MediaItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p471r3.C25630b;

/* renamed from: gs.a */
/* loaded from: classes4.dex */
public final class C19591a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f97333a;

    /* renamed from: b */
    private MediaItem f97334b;

    /* renamed from: c */
    private C25630b f97335c;

    /* renamed from: d */
    private boolean f97336d;

    /* renamed from: gs.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19591a() {
    }

    public C19591a(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "photo");
        this.f97334b = mediaItem;
        this.f97333a = 1;
    }

    /* renamed from: a */
    public final MediaItem m102558a() {
        return this.f97334b;
    }

    /* renamed from: b */
    public final C25630b m102559b() {
        return this.f97335c;
    }

    /* renamed from: c */
    public final int m102560c() {
        return this.f97333a;
    }

    /* renamed from: d */
    public final boolean m102561d() {
        return this.f97336d;
    }

    /* renamed from: e */
    public final void m102562e(boolean z11) {
        this.f97336d = z11;
    }

    /* renamed from: f */
    public final void m102563f(int i11) {
        this.f97333a = i11;
    }

    public C19591a(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "sticker");
        this.f97335c = c25630b;
        this.f97333a = 2;
    }
}
