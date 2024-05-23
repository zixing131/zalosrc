package com.zing.zalo.feed.mvp.album;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.album.OptionAlbumBottomSheet;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p649xl.C29712aa;
import pm0.C24848g0;

/* loaded from: classes4.dex */
public final class OptionAlbumBottomSheet extends BottomSheetZaloViewWithAnim implements InterfaceC17463d.d, InterfaceC0733x {
    public static final C8486a Companion = new C8486a(null);

    /* renamed from: W0 */
    private PrivacyInfo f46028W0 = new PrivacyInfo();

    /* renamed from: X0 */
    private String f46029X0 = "";

    /* renamed from: Y0 */
    private String f46030Y0 = "";

    /* renamed from: Z0 */
    private long f46031Z0;

    /* renamed from: a1 */
    private C29712aa f46032a1;

    /* renamed from: com.zing.zalo.feed.mvp.album.OptionAlbumBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8486a {
        private C8486a() {
        }

        public /* synthetic */ C8486a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: rM */
    private final void m45234rM() {
        C29712aa c29712aa = this.f46032a1;
        if (c29712aa == null) {
            AbstractC19074t.m100223u("binding");
            c29712aa = null;
        }
        c29712aa.f137240v.setImageDrawable(AbstractC23136l9.m118665N(getContext(), this.f46028W0.m45143k()));
        c29712aa.f137238t.setText(this.f46028W0.m45149t());
        c29712aa.f137241w.setOnClickListener(new View.OnClickListener() { // from class: co.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionAlbumBottomSheet.m45235sM(OptionAlbumBottomSheet.this, view);
            }
        });
        c29712aa.f137242x.setOnClickListener(new View.OnClickListener() { // from class: co.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionAlbumBottomSheet.m45236tM(OptionAlbumBottomSheet.this, view);
            }
        });
        c29712aa.f137243y.setOnClickListener(new View.OnClickListener() { // from class: co.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionAlbumBottomSheet.m45237uM(OptionAlbumBottomSheet.this, view);
            }
        });
        c29712aa.f137244z.setOnClickListener(new View.OnClickListener() { // from class: co.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionAlbumBottomSheet.m45238vM(OptionAlbumBottomSheet.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m45235sM(OptionAlbumBottomSheet optionAlbumBottomSheet, View view) {
        AbstractC19074t.m100208f(optionAlbumBottomSheet, "this$0");
        optionAlbumBottomSheet.m45239wM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final void m45236tM(OptionAlbumBottomSheet optionAlbumBottomSheet, View view) {
        AbstractC19074t.m100208f(optionAlbumBottomSheet, "this$0");
        optionAlbumBottomSheet.m45240xM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final void m45237uM(OptionAlbumBottomSheet optionAlbumBottomSheet, View view) {
        AbstractC19074t.m100208f(optionAlbumBottomSheet, "this$0");
        optionAlbumBottomSheet.m45241yM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m45238vM(OptionAlbumBottomSheet optionAlbumBottomSheet, View view) {
        AbstractC19074t.m100208f(optionAlbumBottomSheet, "this$0");
        optionAlbumBottomSheet.m45242zM();
    }

    /* renamed from: wM */
    private final void m45239wM() {
        showDialog(1);
    }

    /* renamed from: xM */
    private final void m45240xM() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_EDIT_ALBUM", true);
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* renamed from: yM */
    private final void m45241yM() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_CHANGE_PRIVACY", true);
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* renamed from: zM */
    private final void m45242zM() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_CHANGE_THEME", true);
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 == null) {
            return;
        }
        this.f46031Z0 = m92642L3.getLong("selected_album_id", -1L);
        String string = m92642L3.getString("EXTRA_TITLE", "");
        AbstractC19074t.m100207e(string, "getString(...)");
        this.f46029X0 = string;
        String string2 = m92642L3.getString("EXTRA_DESC", "");
        AbstractC19074t.m100207e(string2, "getString(...)");
        this.f46030Y0 = string2;
        this.f46028W0.f45973p = m92642L3.getInt("EXTRA_PRIVACY", 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            try {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(4);
                aVar.m43161j(AbstractC8020f0.str_profile_album_edit_album_option_delete_album_confirm);
                aVar.m43165n(m92652XI(AbstractC8020f0.str_no), this);
                aVar.m43169r(AbstractC8020f0.str_profile_album_yes_delete, this);
                return aVar.m43152a();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d == null) {
            return;
        }
        try {
            if (interfaceC17463d.mo92862f() == 1) {
                if (i11 != -2) {
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        m45243qM();
                    }
                } else {
                    interfaceC17463d.dismiss();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int measuredHeight = this.f72454M0.getMeasuredHeight();
        C29712aa c29712aa = this.f46032a1;
        if (c29712aa == null) {
            AbstractC19074t.m100223u("binding");
            c29712aa = null;
        }
        return measuredHeight - c29712aa.f137231A.getBottom();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29712aa m147729c = C29712aa.m147729c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m147729c, "inflate(...)");
        this.f46032a1 = m147729c;
        m45234rM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMaxTranslationY(mo37128eM());
        this.f72454M0.setMinTranslationY(mo37128eM());
        this.f72454M0.setEnableScrollY(false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OptionAlbumBottomSheet";
    }

    /* renamed from: qM */
    public final void m45243qM() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_DELETE_ALBUM", true);
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }
}
