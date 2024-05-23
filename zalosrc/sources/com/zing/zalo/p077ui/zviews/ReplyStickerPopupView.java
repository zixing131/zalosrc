package com.zing.zalo.p077ui.zviews;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b40.C2526d;
import bi0.AbstractC2810d;
import c30.C3255n;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7173p5;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import gi.EnumC19449b;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23136l9;
import ui0.C27280g;
import vg.C28020b3;

/* loaded from: classes6.dex */
public class ReplyStickerPopupView extends BottomPickerView {

    /* renamed from: f1 */
    public static final String f76956f1 = "ReplyStickerPopupView";

    /* renamed from: g1 */
    static final int f76957g1 = AbstractC23136l9.m118742r(192.0f);

    /* renamed from: U0 */
    LinearLayout f76958U0;

    /* renamed from: V0 */
    RobotoTextView f76959V0;

    /* renamed from: W0 */
    RecyclerView f76960W0;

    /* renamed from: X0 */
    LinearLayout f76961X0;

    /* renamed from: Y0 */
    C7173p5.g f76962Y0;

    /* renamed from: Z0 */
    C7173p5.e f76963Z0;

    /* renamed from: a1 */
    String f76964a1;

    /* renamed from: b1 */
    List f76965b1;

    /* renamed from: c1 */
    C7173p5 f76966c1;

    /* renamed from: d1 */
    private String f76967d1 = "";

    /* renamed from: e1 */
    boolean f76968e1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ReplyStickerPopupView$a */
    /* loaded from: classes6.dex */
    public class C14938a implements C7173p5.e {
        C14938a() {
        }

        @Override // com.zing.zalo.adapters.C7173p5.e
        /* renamed from: a */
        public void mo36466a(boolean z11) {
            try {
                if (ReplyStickerPopupView.this.f76968e1) {
                    C2526d.f10270a.m12724p0("csc_msg_footer", EnumC19449b.f96546u.m101746d(), z11);
                    ReplyStickerPopupView.this.f76968e1 = false;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l(ReplyStickerPopupView.f76956f1).mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.adapters.C7173p5.e
        /* renamed from: b */
        public void mo36467b(boolean z11) {
            try {
                LinearLayout linearLayout = ReplyStickerPopupView.this.f76961X0;
                if (linearLayout != null) {
                    if (z11 && linearLayout.getVisibility() != 0) {
                        ReplyStickerPopupView.this.m83631sL(true);
                    } else if (!z11 && ReplyStickerPopupView.this.f76961X0.getVisibility() != 8) {
                        ReplyStickerPopupView.this.m83631sL(false);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l(ReplyStickerPopupView.f76956f1).mo104552e(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ReplyStickerPopupView$b */
    /* loaded from: classes6.dex */
    public class C14939b extends RecyclerView.AbstractC1887n {
        C14939b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int m118742r;
            int i11;
            try {
                int width = recyclerView.getWidth();
                int m9817A0 = recyclerView.m9817A0(view);
                int i12 = ((width / 4) - C7173p5.f39252F) / 2;
                if (m9817A0 >= 4) {
                    m118742r = AbstractC23136l9.m118742r(7.0f);
                    i11 = 0;
                } else {
                    m118742r = AbstractC23136l9.m118742r(7.0f);
                    i11 = m118742r;
                }
                rect.set(i12, i11, i12, m118742r);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ReplyStickerPopupView$c */
    /* loaded from: classes6.dex */
    public class C14940c extends RecyclerView.AbstractC1892s {
        C14940c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            try {
                if (i11 == 0) {
                    ReplyStickerPopupView.this.f76966c1.m36465S(false);
                } else {
                    ReplyStickerPopupView.this.f76966c1.m36465S(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: pL */
    private void m83628pL() {
        try {
            this.f76958U0 = (LinearLayout) this.f83659I0.findViewById(AbstractC6918a0.content_view);
            this.f76961X0 = (LinearLayout) this.f83659I0.findViewById(AbstractC6918a0.desc_container);
            this.f76959V0 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.title);
            this.f83659I0.setBackground(C27280g.m139658a(m92689tK(), AbstractC2810d.bg_bottom_sheet_shadow));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        RecyclerView recyclerView = (RecyclerView) this.f83659I0.findViewById(AbstractC6918a0.sticker_list);
        this.f76960W0 = recyclerView;
        recyclerView.setLayoutManager(gridLayoutManager);
        this.f76960W0.m9816A(new C14939b());
        this.f76960W0.m9826E(new C14940c());
        this.f76959V0.setText(this.f76964a1);
        C7173p5 c7173p5 = new C7173p5(getContext(), this.f76965b1, this.f76960W0, this.f76962Y0, this.f76963Z0);
        this.f76966c1 = c7173p5;
        c7173p5.m36463Q(this.f76967d1);
        this.f76966c1.m36464R(C3255n.m16559j());
        this.f76960W0.setAdapter(this.f76966c1);
        if (this.f76966c1.mo10003k() / 4.0f > 2.0f) {
            this.f76960W0.getLayoutParams().height = f76957g1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qL */
    public /* synthetic */ void m83629qL(boolean z11) {
        int i11;
        try {
            LinearLayout linearLayout = this.f76961X0;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: rL */
    public static ReplyStickerPopupView m83630rL(String str, List list, C7173p5.g gVar) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        ReplyStickerPopupView replyStickerPopupView = new ReplyStickerPopupView();
        replyStickerPopupView.mo60305zK(m78535kL);
        replyStickerPopupView.f76962Y0 = gVar;
        replyStickerPopupView.f76964a1 = str;
        replyStickerPopupView.f76965b1 = list;
        replyStickerPopupView.f76963Z0 = new C14938a();
        return replyStickerPopupView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sL */
    public void m83631sL(final boolean z11) {
        this.f83663M0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.fc0
            @Override // java.lang.Runnable
            public final void run() {
                ReplyStickerPopupView.this.m83629qL(z11);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f83658H0 = false;
        if (m92676n2() != null) {
            this.f76967d1 = C28020b3.f130648a.m141208y("REPLY_POPUP_", m92676n2());
        }
        this.f76968e1 = true;
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        super.mo12457Tv(interfaceC17463d);
        C7173p5.g gVar = this.f76962Y0;
        if (gVar != null) {
            gVar.mo36470a();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.suggest_sticker_popup;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        C7173p5 c7173p5;
        super.onResume();
        if (C3255n.m16559j() && (c7173p5 = this.f76966c1) != null) {
            c7173p5.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m83628pL();
        } catch (Exception e11) {
            e11.printStackTrace();
            dismiss();
        }
    }
}
