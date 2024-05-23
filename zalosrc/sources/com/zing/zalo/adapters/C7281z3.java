package com.zing.zalo.adapters;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import au.EnumC2344e0;
import au.EnumC2382z;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.file.MediaStoreFilePage;
import com.zing.zalo.p077ui.mediastore.link.MediaStoreLinkPage;
import com.zing.zalo.p077ui.mediastore.media.MediaStoreMediaPage;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zing.zalo.adapters.z3 */
/* loaded from: classes3.dex */
public final class C7281z3 extends AbstractC17505t0 {

    /* renamed from: A */
    private MediaStoreBasePage.InterfaceC12276c f39905A;

    /* renamed from: B */
    private MediaStoreBasePage.InterfaceC12275b f39906B;

    /* renamed from: C */
    private boolean f39907C;

    /* renamed from: D */
    private List f39908D;

    /* renamed from: E */
    private final Runnable f39909E;

    /* renamed from: w */
    private CreateMediaStoreParam f39910w;

    /* renamed from: x */
    private boolean[] f39911x;

    /* renamed from: y */
    private int f39912y;

    /* renamed from: z */
    private Handler f39913z;

    /* renamed from: com.zing.zalo.adapters.z3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39914a;

        static {
            int[] iArr = new int[EnumC2344e0.values().length];
            try {
                iArr[EnumC2344e0.f9853r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2344e0.f9854s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39914a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7281z3(C17487o0 c17487o0, CreateMediaStoreParam createMediaStoreParam, List list) {
        super(c17487o0);
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        AbstractC19074t.m100208f(list, "tabViewList");
        this.f39910w = createMediaStoreParam;
        this.f39911x = new boolean[list.size()];
        this.f39913z = new Handler(Looper.getMainLooper());
        this.f39908D = new ArrayList(list);
        this.f39909E = new Runnable() { // from class: com.zing.zalo.adapters.y3
            @Override // java.lang.Runnable
            public final void run() {
                C7281z3.m37042C(C7281z3.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m37042C(C7281z3 c7281z3) {
        AbstractC19074t.m100208f(c7281z3, "this$0");
        try {
            int i11 = c7281z3.f39912y;
            boolean[] zArr = c7281z3.f39911x;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            c7281z3.mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    public final void m37043B(int i11) {
        try {
            if (i11 < this.f39911x.length) {
                this.f39912y = i11;
                this.f39913z.removeCallbacks(this.f39909E);
                this.f39913z.post(this.f39909E);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public final void m37044D(MediaStoreBasePage.InterfaceC12275b interfaceC12275b) {
        this.f39906B = interfaceC12275b;
        int size = this.f89199t.size();
        for (int i11 = 0; i11 < size; i11++) {
            ZaloView zaloView = (ZaloView) this.f89199t.get(i11);
            if (zaloView instanceof MediaStoreBasePage) {
                ((MediaStoreBasePage) zaloView).m68891Vh(this.f39906B);
            }
        }
    }

    /* renamed from: E */
    public final void m37045E(MediaStoreBasePage.InterfaceC12276c interfaceC12276c) {
        this.f39905A = interfaceC12276c;
        int size = this.f89199t.size();
        for (int i11 = 0; i11 < size; i11++) {
            ZaloView zaloView = (ZaloView) this.f89199t.get(i11);
            if (zaloView instanceof MediaStoreBasePage) {
                ((MediaStoreBasePage) zaloView).m68907eN(this.f39905A);
            }
        }
    }

    /* renamed from: F */
    public final void m37046F(int i11) {
        this.f39911x[i11] = true;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f39908D.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        ZaloView zaloView;
        AbstractC19074t.m100208f(obj, "object");
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f39907C) {
            this.f39907C = false;
            return -2;
        }
        if (obj instanceof ZaloView) {
            zaloView = (ZaloView) obj;
        } else {
            zaloView = null;
        }
        if (zaloView == null || !(obj instanceof MediaStoreBasePage)) {
            return -2;
        }
        return -1;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0, com.zing.p058v4.view.AbstractC6881a
    /* renamed from: o */
    public void mo35343o(Parcelable parcelable, ClassLoader classLoader) {
        super.mo35343o(parcelable, classLoader);
        try {
            int size = this.f89199t.size();
            for (int i11 = 0; i11 < size; i11++) {
                ZaloView zaloView = (ZaloView) this.f89199t.get(i11);
                if (zaloView instanceof MediaStoreBasePage) {
                    ((MediaStoreBasePage) zaloView).m68907eN(this.f39905A);
                    ((MediaStoreBasePage) zaloView).m68891Vh(this.f39906B);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView mediaStoreLinkPage;
        Bundle bundle = new Bundle();
        bundle.putBoolean("bol_background_white", true);
        this.f39910w.m40913f(bundle);
        if (!this.f39911x[i11]) {
            mediaStoreLinkPage = new TabLoadingView();
        } else {
            int i12 = a.f39914a[((EnumC2344e0) this.f39908D.get(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    bundle.putInt("extra_current_type", EnumC2382z.f9945r.m12438c());
                    mediaStoreLinkPage = new MediaStoreMediaPage();
                } else {
                    bundle.putInt("extra_current_type", EnumC2382z.f9947t.m12438c());
                    mediaStoreLinkPage = new MediaStoreFilePage();
                }
            } else {
                bundle.putInt("extra_current_type", EnumC2382z.f9946s.m12438c());
                mediaStoreLinkPage = new MediaStoreLinkPage();
            }
        }
        mediaStoreLinkPage.mo60305zK(bundle);
        if (mediaStoreLinkPage instanceof MediaStoreBasePage) {
            MediaStoreBasePage mediaStoreBasePage = (MediaStoreBasePage) mediaStoreLinkPage;
            mediaStoreBasePage.m68907eN(this.f39905A);
            mediaStoreBasePage.m68891Vh(this.f39906B);
        }
        return mediaStoreLinkPage;
    }
}
