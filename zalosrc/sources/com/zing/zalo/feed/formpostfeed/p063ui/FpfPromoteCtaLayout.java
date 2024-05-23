package com.zing.zalo.feed.formpostfeed.p063ui;

import am.AbstractC0924m0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.formpostfeed.data.PromotePostItem;
import com.zing.zalo.feed.formpostfeed.p063ui.C8459a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p651xn.C30169a;
import p687yn.C31023a;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* loaded from: classes4.dex */
public final class FpfPromoteCtaLayout extends FrameLayout {

    /* renamed from: p */
    private List f45917p;

    /* renamed from: q */
    private final RecyclerView f45918q;

    /* renamed from: r */
    private final LinearLayoutManager f45919r;

    /* renamed from: s */
    private final C8459a f45920s;

    /* renamed from: t */
    private C8459a.b f45921t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpfPromoteCtaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f45917p = new ArrayList();
        this.f45918q = new RecyclerView(getContext());
        this.f45919r = new LinearLayoutManager(getContext());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f45920s = new C8459a(context2);
        m45003e();
        m45009h();
        m45004i();
    }

    /* renamed from: a */
    private final boolean m45001a(String str, C31023a c31023a) {
        return AbstractC19074t.m100204b(str, c31023a.m150839i());
    }

    /* renamed from: c */
    private final int m45002c(PromotePostItem promotePostItem) {
        int id2 = promotePostItem.getId();
        if (id2 != 1) {
            if (id2 != 2) {
                if (id2 != 3) {
                    if (id2 != 4) {
                        if (id2 != 5) {
                            return AbstractC16803z.ic_post_feed_photo_solid;
                        }
                        return AbstractC16803z.ic_post_feed_album_solid;
                    }
                    return AbstractC16803z.icn_timeline_promote_memory;
                }
                return AbstractC16803z.icn_timeline_postfeed_background;
            }
            return AbstractC16803z.ic_post_feed_video_solid;
        }
        return AbstractC16803z.ic_post_feed_photo_solid;
    }

    /* renamed from: e */
    private final void m45003e() {
        this.f45919r.m9723C2(0);
        this.f45918q.setAdapter(this.f45920s);
        this.f45918q.setLayoutManager(this.f45919r);
        this.f45918q.m9816A(new C8460b());
        this.f45918q.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(this.f45918q);
    }

    /* renamed from: i */
    private final void m45004i() {
        try {
            if (this.f45917p.isEmpty()) {
                setVisibility(8);
            } else {
                setVisibility(0);
                this.f45920s.m45047T(this.f45917p);
                this.f45920s.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final View m45005b(String str) {
        Object obj;
        int i11;
        View view;
        AbstractC19074t.m100208f(str, "tipCat");
        Iterator it = this.f45917p.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m45001a(str, (C31023a) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C31023a c31023a = (C31023a) obj;
        int i12 = -1;
        if (c31023a != null) {
            i11 = c31023a.m150835e();
        } else {
            i11 = -1;
        }
        Iterator it2 = this.f45917p.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((C31023a) it2.next()).m150835e() == i11) {
                i12 = i13;
                break;
            }
            i13++;
        }
        if (i12 >= 0) {
            RecyclerView.AbstractC1876c0 m9900t0 = this.f45918q.m9900t0(i12);
            if (m9900t0 != null) {
                view = m9900t0.f7784p;
            } else {
                view = null;
            }
            if (view != null && view.getBottom() <= AbstractC23136l9.m118713h0() && view.getTop() >= 0 && view.getLeft() >= 0 && view.getRight() <= AbstractC23136l9.m118722k0()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m45006d(String str) {
        Object obj;
        AbstractC19074t.m100208f(str, "tipCat");
        Iterator it = this.f45917p.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m45001a(str, (C31023a) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m45007f(PromotePostItem promotePostItem) {
        AbstractC19074t.m100208f(promotePostItem, "<this>");
        int id2 = promotePostItem.getId();
        if (id2 == 1) {
            return true;
        }
        if (id2 != 2) {
            if (id2 == 3 || id2 == 4 || id2 != 5) {
                return true;
            }
            return AbstractC0924m0.m4195s9();
        }
        return AbstractC23309i.m121565We();
    }

    /* renamed from: g */
    public final void m45008g() {
        m45009h();
        m45004i();
    }

    public final C8459a.b getOnPromoteItemClickListener() {
        return this.f45921t;
    }

    /* renamed from: h */
    public final void m45009h() {
        List<PromotePostItem> promotePost = C30169a.f140177a.m148801a().m44994b().getPromotePost();
        if (promotePost.isEmpty()) {
            return;
        }
        this.f45917p.clear();
        for (PromotePostItem promotePostItem : promotePost) {
            if (m45007f(promotePostItem)) {
                C31023a c31023a = new C31023a(promotePostItem.getId());
                c31023a.m150846p(promotePostItem.getCaption().getText().m44977b());
                c31023a.m150847q(promotePostItem.getCaption().getColor().getValue());
                c31023a.m150842l(promotePostItem.getBgColor().getValue());
                c31023a.m150844n(promotePostItem.getIcon());
                boolean z11 = false;
                c31023a.m150845o(false);
                c31023a.m150843m(m45002c(promotePostItem));
                c31023a.m150848r(promotePostItem.getTipCat());
                C28212v6 m141453i = AbstractC28025b8.m141453i(promotePostItem.getTipCat());
                if (m141453i != null) {
                    AbstractC19074t.m100205c(m141453i);
                    if (m141453i.m142167f() && m141453i.f131580f) {
                        z11 = true;
                    }
                    c31023a.m150845o(z11);
                }
                c31023a.m150849s(promotePostItem.getTrackingParams());
                this.f45917p.add(c31023a);
            }
        }
    }

    public final void setOnPromoteItemClickListener(C8459a.b bVar) {
        this.f45921t = bVar;
        this.f45920s.m45048U(bVar);
    }
}
