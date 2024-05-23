package c10;

import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.i */
/* loaded from: classes5.dex */
public final class C3204i {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f13699a;

    /* renamed from: b */
    private Video f13700b;

    /* renamed from: c10.i$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32687a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32687a f13701q = new C32687a();

            C32687a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3204i mo205i9(JsonObject jsonObject) {
                int i11;
                AbstractC19074t.m100208f(jsonObject, "json");
                Integer m51729j = AbstractC9465b.m51729j(jsonObject, "select_index_tab");
                if (m51729j != null) {
                    i11 = m51729j.intValue();
                } else {
                    i11 = 1;
                }
                Video video = new Video(VideoData.C9437b.Companion.m51386a(jsonObject));
                if (video.m52856N() == null) {
                    video.m52866S0("");
                }
                return new C3204i(i11, video);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16297a() {
            return C32687a.f13701q;
        }
    }

    public C3204i(int i11, Video video) {
        AbstractC19074t.m100208f(video, "video");
        this.f13699a = i11;
        this.f13700b = video;
    }

    /* renamed from: a */
    public final int m16294a() {
        return this.f13699a;
    }

    /* renamed from: b */
    public final Video m16295b() {
        return this.f13700b;
    }

    /* renamed from: c */
    public final void m16296c(Video video) {
        AbstractC19074t.m100208f(video, "<set-?>");
        this.f13700b = video;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3204i)) {
            return false;
        }
        C3204i c3204i = (C3204i) obj;
        return this.f13699a == c3204i.f13699a && AbstractC19074t.m100204b(this.f13700b, c3204i.f13700b);
    }

    public int hashCode() {
        return (this.f13699a * 31) + this.f13700b.hashCode();
    }

    public String toString() {
        return "CommonVideo(activeTabId=" + this.f13699a + ", video=" + this.f13700b + ")";
    }
}
