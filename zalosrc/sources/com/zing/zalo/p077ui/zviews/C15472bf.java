package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.p077ui.zviews.C15472bf;
import fi.C18953k;
import gg0.AbstractC19444a;
import gi.EnumC19448a;
import gi.EnumC19449b;
import gi.EnumC19450c;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p471r3.C25630b;
import p683yj.C30997b;
import p716zh.C31902e9;
import p716zh.C31917f9;
import vg.C28203u6;

/* renamed from: com.zing.zalo.ui.zviews.bf */
/* loaded from: classes6.dex */
public class C15472bf {

    /* renamed from: a */
    private final WeakReference f79920a;

    /* renamed from: b */
    private C30997b f79921b;

    /* renamed from: c */
    public String f79922c;

    /* renamed from: d */
    private final C18953k f79923d;

    /* renamed from: e */
    private final C18953k.c f79924e = new a();

    /* renamed from: com.zing.zalo.ui.zviews.bf$a */
    /* loaded from: classes6.dex */
    public class a implements C18953k.c {
        a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m87274d(C30997b c30997b, C31917f9 c31917f9, EnumC19450c enumC19450c) {
            String str;
            try {
                FeedStickerSuggestView feedStickerSuggestView = (FeedStickerSuggestView) C15472bf.this.f79920a.get();
                if (feedStickerSuggestView != null) {
                    if (!C15472bf.this.m87270g(feedStickerSuggestView.getContext())) {
                        if (C15472bf.this.f79921b != null && !TextUtils.isEmpty(C15472bf.this.f79921b.m150661e())) {
                            feedStickerSuggestView.m79734f();
                            return;
                        }
                        return;
                    }
                    if (C15472bf.this.f79921b != null && !TextUtils.isEmpty(C15472bf.this.f79921b.m150658b()) && TextUtils.equals(c30997b.m150658b(), C15472bf.this.f79921b.m150658b()) && c31917f9.f146630b == EnumC19449b.f96542q) {
                        C25630b c25630b = new C25630b();
                        c25630b.m132405O(-100);
                        C31902e9 c31902e9 = new C31902e9(0);
                        c31902e9.m153334z(c25630b);
                        c31917f9.f146629a.add(c31902e9);
                        Iterator it = c31917f9.f146629a.iterator();
                        while (it.hasNext()) {
                            if (((C31902e9) it.next()).m153322n() != 0) {
                                it.remove();
                            }
                        }
                        if (C15472bf.this.f79921b != null && !TextUtils.isEmpty(C15472bf.this.f79921b.m150662f()) && C15472bf.this.f79921b.m150662f().trim().equals(feedStickerSuggestView.getEdtCommentText().trim())) {
                            str = "49180005";
                        } else {
                            str = "49180006";
                        }
                        AbstractC23647d.m123897g(str);
                        if (c31917f9.f146629a.size() > 1) {
                            feedStickerSuggestView.m79745u(enumC19450c, c31917f9.f146629a, false);
                            AbstractC23647d.m123897g("49180001");
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // fi.C18953k.c
        /* renamed from: a */
        public void mo16434a(EnumC19450c enumC19450c, C30997b c30997b, C31917f9 c31917f9) {
            if (((FeedStickerSuggestView) C15472bf.this.f79920a.get()).m79739l()) {
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.af

                    /* renamed from: q */
                    public final /* synthetic */ C30997b f79810q;

                    /* renamed from: r */
                    public final /* synthetic */ C31917f9 f79811r;

                    /* renamed from: s */
                    public final /* synthetic */ EnumC19450c f79812s;

                    public /* synthetic */ RunnableC15435af(C30997b c30997b2, C31917f9 c31917f92, EnumC19450c enumC19450c2) {
                        r2 = c30997b2;
                        r3 = c31917f92;
                        r4 = enumC19450c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C15472bf.a.this.m87274d(r2, r3, r4);
                    }
                });
            }
        }

        @Override // fi.C18953k.c
        /* renamed from: b */
        public void mo16435b(EnumC19448a enumC19448a, String str) {
            if (enumC19448a == EnumC19448a.f96537t) {
                C15472bf.this.m87267f();
            }
        }
    }

    public C15472bf(FeedStickerSuggestView feedStickerSuggestView, C18953k c18953k) {
        this.f79920a = new WeakReference(feedStickerSuggestView);
        this.f79923d = c18953k;
    }

    /* renamed from: f */
    public void m87267f() {
        if (((FeedStickerSuggestView) this.f79920a.get()).m79739l()) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.ze
                public /* synthetic */ RunnableC16410ze() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C15472bf.this.m87268h();
                }
            });
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m87268h() {
        try {
            FeedStickerSuggestView feedStickerSuggestView = (FeedStickerSuggestView) this.f79920a.get();
            if (feedStickerSuggestView != null) {
                feedStickerSuggestView.m79734f();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e */
    public C30997b m87269e() {
        return this.f79921b;
    }

    /* renamed from: g */
    public boolean m87270g(Context context) {
        if (AbstractC23309i.m121234Ng() && AbstractC23309i.m121305Pd()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:2:0x0000, B:6:0x0028, B:8:0x002c, B:10:0x003c, B:13:0x0046, B:15:0x004a, B:17:0x0069, B:21:0x0063, B:23:0x0075), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:2:0x0000, B:6:0x0028, B:8:0x002c, B:10:0x003c, B:13:0x0046, B:15:0x004a, B:17:0x0069, B:21:0x0063, B:23:0x0075), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:2:0x0000, B:6:0x0028, B:8:0x002c, B:10:0x003c, B:13:0x0046, B:15:0x004a, B:17:0x0069, B:21:0x0063, B:23:0x0075), top: B:1:0x0000 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m87271i(EnumC19450c enumC19450c, EnumC19450c enumC19450c2, String str, boolean z11) {
        try {
            String m99327D0 = C18953k.m99327D0(str);
            boolean z12 = false;
            C30997b.c m99323B = C18953k.m99323B(C28203u6.f131407a.m141815l(this.f79922c, false));
            C30997b m99403g0 = this.f79923d.m99403g0(str, m99327D0, m99323B);
            FeedStickerSuggestView feedStickerSuggestView = (FeedStickerSuggestView) this.f79920a.get();
            if (!TextUtils.isEmpty(m99327D0) && m99403g0 != null) {
                if (this.f79921b != null) {
                    if (TextUtils.equals(m99403g0.m150661e(), this.f79921b.m150661e())) {
                        if (!feedStickerSuggestView.m79736h()) {
                        }
                        this.f79921b = m99403g0;
                        if (!z11) {
                            int lastIndexOf = str.lastIndexOf(m99403g0.m150662f());
                            this.f79921b.m150676t(lastIndexOf, this.f79921b.m150662f().length() + lastIndexOf);
                        } else {
                            m99403g0.m150676t(-1, -1);
                        }
                        if (!z12) {
                            this.f79923d.m99400c0(enumC19450c, this.f79921b, false, m99323B, this.f79924e);
                            return;
                        }
                        return;
                    }
                }
                z12 = true;
                this.f79921b = m99403g0;
                if (!z11) {
                }
                if (!z12) {
                }
            }
            feedStickerSuggestView.m79734f();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m87272j() {
        this.f79921b = null;
    }
}
