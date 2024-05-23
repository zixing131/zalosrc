package com.zing.zalo.p077ui.showcase;

import android.content.Context;
import android.view.ViewGroup;
import com.zing.zalo.p077ui.showcase.C13309e;
import com.zing.zalo.p077ui.showcase.WalkThroughOnboardView;
import fn0.AbstractC19074t;
import java.util.ArrayList;

/* renamed from: com.zing.zalo.ui.showcase.e */
/* loaded from: classes6.dex */
public final class C13309e {

    /* renamed from: a */
    private final ViewGroup f68397a;

    /* renamed from: b */
    private final WalkThroughOnboardView f68398b;

    /* renamed from: c */
    private final ArrayList f68399c;

    /* renamed from: com.zing.zalo.ui.showcase.e$a */
    /* loaded from: classes6.dex */
    public static final class a implements WalkThroughOnboardView.InterfaceC13300b {
        a() {
        }

        @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
        /* renamed from: a */
        public void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
            AbstractC19074t.m100208f(walkThroughOnboardView, "walkThroughOnboardView");
            C13309e.this.m74727e();
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.e$b */
    /* loaded from: classes6.dex */
    public static final class b implements WalkThroughOnboardView.InterfaceC13300b {

        /* renamed from: a */
        final /* synthetic */ WalkThroughOnboardView.InterfaceC13300b f68401a;

        /* renamed from: b */
        final /* synthetic */ C13309e f68402b;

        b(WalkThroughOnboardView.InterfaceC13300b interfaceC13300b, C13309e c13309e) {
            this.f68401a = interfaceC13300b;
            this.f68402b = c13309e;
        }

        @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
        /* renamed from: a */
        public void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
            AbstractC19074t.m100208f(walkThroughOnboardView, "walkThroughOnboardView");
            this.f68401a.mo74659a(walkThroughOnboardView);
            this.f68402b.m74727e();
        }
    }

    public C13309e(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parentView");
        this.f68397a = viewGroup;
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        WalkThroughOnboardView walkThroughOnboardView = new WalkThroughOnboardView(context);
        this.f68398b = walkThroughOnboardView;
        this.f68399c = new ArrayList();
        walkThroughOnboardView.setListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m74723f(C13309e c13309e) {
        AbstractC19074t.m100208f(c13309e, "this$0");
        c13309e.f68397a.removeView(c13309e.f68398b);
        c13309e.f68398b.setVisibility(8);
    }

    /* renamed from: b */
    public final void m74724b(WalkThroughOnboardView.C13302d c13302d) {
        AbstractC19074t.m100208f(c13302d, "step");
        this.f68399c.add(c13302d);
    }

    /* renamed from: c */
    public final boolean m74725c() {
        if (this.f68399c.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m74726d() {
        this.f68397a.removeView(this.f68398b);
        this.f68398b.setVisibility(8);
    }

    /* renamed from: e */
    public final void m74727e() {
        this.f68398b.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: sa0.j
            @Override // java.lang.Runnable
            public final void run() {
                C13309e.m74723f(C13309e.this);
            }
        }).start();
    }

    /* renamed from: g */
    public final void m74728g(WalkThroughOnboardView.InterfaceC13300b interfaceC13300b) {
        AbstractC19074t.m100208f(interfaceC13300b, "listener");
        this.f68398b.setListener(new b(interfaceC13300b, this));
    }

    /* renamed from: h */
    public final void m74729h() {
        if (m74725c()) {
            this.f68398b.setData(this.f68399c);
            if (this.f68398b.getParent() == null) {
                this.f68398b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.f68397a.addView(this.f68398b);
            }
            this.f68398b.setVisibility(0);
            this.f68398b.setAlpha(0.0f);
            this.f68398b.animate().alpha(1.0f).setDuration(200L).start();
        }
    }
}
