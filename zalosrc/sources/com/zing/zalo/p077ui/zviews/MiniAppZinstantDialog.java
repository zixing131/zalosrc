package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.rounedlayout.FrameRoundedLayout;
import com.zing.zalo.p077ui.rounedlayout.RelativeRoundedLayout;
import com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView;
import com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBottomPermissionView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p189gv.C19609h;
import p649xl.C29944n8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public class MiniAppZinstantDialog extends MiniAppZinstantBaseView {
    public static final C14611a Companion = new C14611a(null);

    /* renamed from: Y0 */
    private C29944n8 f75145Y0;

    /* renamed from: Z0 */
    private final InterfaceC24854k f75146Z0;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantDialog$a */
    /* loaded from: classes6.dex */
    public static final class C14611a {
        private C14611a() {
        }

        public /* synthetic */ C14611a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final Bundle m81766a(C19609h c19609h, String str) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("MINI_APP_INFO_EXTRA", c19609h);
            if (str != null) {
                bundle.putString("EXTRA_ACTION", str);
            }
            return bundle;
        }

        /* renamed from: c */
        public static /* synthetic */ MiniAppZinstantDialog m81767c(C14611a c14611a, C17487o0 c17487o0, MiniAppZinstantDialog miniAppZinstantDialog, C19609h c19609h, String str, String str2, int i11, Object obj) {
            String str3;
            String str4;
            if ((i11 & 2) != 0) {
                miniAppZinstantDialog = new MiniAppZinstantDialog();
            }
            MiniAppZinstantDialog miniAppZinstantDialog2 = miniAppZinstantDialog;
            if ((i11 & 8) != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if ((i11 & 16) != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            return c14611a.m81768b(c17487o0, miniAppZinstantDialog2, c19609h, str3, str4);
        }

        /* renamed from: b */
        public final synchronized MiniAppZinstantDialog m81768b(C17487o0 c17487o0, MiniAppZinstantDialog miniAppZinstantDialog, C19609h c19609h, String str, String str2) {
            try {
                AbstractC19074t.m100208f(miniAppZinstantDialog, "miniAppZinstantDialog");
                if (c17487o0 != null && c19609h != null) {
                    Bundle m81766a = m81766a(c19609h, str);
                    if (str2 != null) {
                        m81766a.putString("EXTRA_MA_ZINSTANT_CACHE", str2);
                    }
                    miniAppZinstantDialog.mo60305zK(m81766a);
                    c17487o0.mo89693h2(miniAppZinstantDialog, "MiniAppZinstantDialog", 0, true);
                    return miniAppZinstantDialog;
                }
                return null;
            } finally {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantDialog$b */
    /* loaded from: classes6.dex */
    static final class C14612b extends AbstractC19075u implements InterfaceC18494a {
        C14612b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiniAppZinstantSkeleton mo12V4() {
            MiniAppZinstantSkeleton miniAppZinstantSkeleton;
            MiniAppZinstantDialog miniAppZinstantDialog = MiniAppZinstantDialog.this;
            if (miniAppZinstantDialog instanceof MiniAppZinstantBottomPermissionView) {
                Context context = ((MiniAppZinstantBottomPermissionView) MiniAppZinstantDialog.this).getContext();
                AbstractC19074t.m100205c(context);
                miniAppZinstantSkeleton = new MiniAppPermissionDialogSkeletonView(context);
            } else if (miniAppZinstantDialog instanceof MiniAppZinstantBottomMenu) {
                Context context2 = ((MiniAppZinstantBottomMenu) MiniAppZinstantDialog.this).getContext();
                AbstractC19074t.m100205c(context2);
                miniAppZinstantSkeleton = new MiniAppBottomMenuSkeletonView(context2);
            } else {
                Context context3 = MiniAppZinstantDialog.this.getContext();
                AbstractC19074t.m100205c(context3);
                miniAppZinstantSkeleton = new MiniAppZinstantSkeleton(context3);
            }
            ViewGroup mo81263CM = MiniAppZinstantDialog.this.mo81263CM();
            if (mo81263CM != null) {
                mo81263CM.addView(miniAppZinstantSkeleton, new ViewGroup.LayoutParams(-1, -2));
            }
            return miniAppZinstantSkeleton;
        }
    }

    public MiniAppZinstantDialog() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C14612b());
        this.f75146Z0 = m129210a;
    }

    /* renamed from: PM */
    private final MiniAppZinstantSkeleton m81764PM() {
        return (MiniAppZinstantSkeleton) this.f75146Z0.getValue();
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: CM */
    public ViewGroup mo81263CM() {
        C29944n8 c29944n8 = this.f75145Y0;
        if (c29944n8 != null) {
            return c29944n8.f138779r;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: HM */
    public View mo81264HM() {
        return m81764PM();
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: IM */
    public MiniAppZinstantLayout mo81265IM() {
        C29944n8 c29944n8 = this.f75145Y0;
        if (c29944n8 != null) {
            return c29944n8.f138781t;
        }
        return null;
    }

    /* renamed from: QM */
    public final C29944n8 m81765QM() {
        return this.f75145Y0;
    }

    /* renamed from: RM */
    public void mo81425RM() {
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        int i11;
        RelativeRoundedLayout relativeRoundedLayout;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        FrameRoundedLayout frameRoundedLayout = new FrameRoundedLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(6.0f));
        layoutParams.addRule(10, -1);
        layoutParams.addRule(14, -1);
        frameRoundedLayout.setCornerRadius(AbstractC23136l9.m118742r(3.0f));
        if (C23212s8.m119602i()) {
            i11 = AbstractC2808b.ng80;
        } else {
            i11 = AbstractC2808b.ng20;
        }
        frameRoundedLayout.setBackgroundColor(AbstractC23136l9.m118639A(i11));
        C29944n8 c29944n8 = this.f75145Y0;
        if (c29944n8 != null && (relativeRoundedLayout = c29944n8.f138779r) != null) {
            relativeRoundedLayout.addView(frameRoundedLayout, layoutParams);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: iM */
    public void mo81733iM(boolean z11) {
        mo81425RM();
        super.mo81733iM(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: kM */
    public View mo81267kM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        DragToCloseLayout dragToCloseLayout;
        DragToCloseLayout dragToCloseLayout2;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (this instanceof MiniAppZinstantBottomMenu) {
            i11 = 4;
        } else if (this instanceof MiniAppZinstantBottomPermissionView) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.putInt("MINI_APP_VIEW_TYPE_TAG", i11);
        }
        C29944n8 m148281a = C29944n8.m148281a(layoutInflater.inflate(AbstractC7409c0.mp_zinstant_bottom_dialog, viewGroup, false));
        this.f75145Y0 = m148281a;
        if (m148281a != null && (dragToCloseLayout2 = m148281a.f138780s) != null) {
            dragToCloseLayout2.setDisableTouch(false);
        }
        C29944n8 c29944n8 = this.f75145Y0;
        if (c29944n8 != null && (dragToCloseLayout = c29944n8.f138780s) != null) {
            dragToCloseLayout.setDirection(1);
        }
        C29944n8 c29944n82 = this.f75145Y0;
        if (c29944n82 != null) {
            return c29944n82.getRoot();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: nM */
    public View mo81268nM() {
        C29944n8 c29944n8 = this.f75145Y0;
        if (c29944n8 != null) {
            return c29944n8.f138778q;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: oM */
    public View mo81269oM() {
        C29944n8 c29944n8 = this.f75145Y0;
        if (c29944n8 != null) {
            return c29944n8.f138780s;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: qM */
    public void mo81270qM(boolean z11) {
        mo81423zM(z11);
    }
}
