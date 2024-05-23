package h10;

import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p10.EnumC24604h;

/* renamed from: h10.b */
/* loaded from: classes5.dex */
public final class C19701b extends AbstractC19711l {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final GetCommentLiveRes.CommentData f97729c;

    /* renamed from: h10.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19701b m103382a(GetCommentLiveRes.CommentData commentData) {
            AbstractC19074t.m100208f(commentData, "comment");
            return new C19701b(commentData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19701b(GetCommentLiveRes.CommentData commentData) {
        super(commentData.m51644b(), EnumC24604h.f118391v);
        AbstractC19074t.m100208f(commentData, "comment");
        this.f97729c = commentData;
    }

    /* renamed from: d */
    public final GetCommentLiveRes.CommentData m103381d() {
        return this.f97729c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19701b) && AbstractC19074t.m100204b(this.f97729c, ((C19701b) obj).f97729c);
    }

    public int hashCode() {
        return this.f97729c.hashCode();
    }

    public String toString() {
        return "CommentEmitEvent(comment=" + this.f97729c + ")";
    }
}
