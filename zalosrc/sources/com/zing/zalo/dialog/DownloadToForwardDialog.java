package com.zing.zalo.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import bn.EnumC2882j0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.AbstractC7999c;
import com.zing.zalo.dialog.DownloadToForwardDialog;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import nh0.C23793c;
import p348mi.AbstractC23309i;
import p462qv.C25496a;
import p649xl.C30129y2;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import sy.AbstractC26423o;
import th.AbstractC26689j;

/* loaded from: classes3.dex */
public final class DownloadToForwardDialog extends DialogView {
    public static final C7971a Companion = new C7971a(null);

    /* renamed from: H0 */
    private C30129y2 f43472H0;

    /* renamed from: I0 */
    private final InterfaceC24854k f43473I0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C8000d.class), new C7976f(new C7975e(this)), null);

    /* renamed from: J0 */
    private List f43474J0;

    /* renamed from: K0 */
    private long f43475K0;

    /* renamed from: com.zing.zalo.dialog.DownloadToForwardDialog$a */
    /* loaded from: classes3.dex */
    public static final class C7971a {
        private C7971a() {
        }

        public /* synthetic */ C7971a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final DownloadToForwardDialog m42899a(List list) {
            AbstractC19074t.m100208f(list, "messagesToShare");
            DownloadToForwardDialog downloadToForwardDialog = new DownloadToForwardDialog();
            downloadToForwardDialog.m42898nL(list);
            return downloadToForwardDialog;
        }
    }

    /* renamed from: com.zing.zalo.dialog.DownloadToForwardDialog$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7972b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43476a;

        static {
            int[] iArr = new int[EnumC2882j0.values().length];
            try {
                iArr[EnumC2882j0.f11478q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2882j0.f11479r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2882j0.f11483v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2882j0.f11480s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2882j0.f11481t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC2882j0.f11482u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC2882j0.f11484w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC2882j0.f11486y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC2882j0.f11485x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f43476a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.DownloadToForwardDialog$c */
    /* loaded from: classes3.dex */
    public static final class C7973c extends AbstractC19075u implements InterfaceC18505l {
        C7973c() {
            super(1);
        }

        /* renamed from: a */
        public final void m42900a(AbstractC7999c abstractC7999c) {
            ShareView shareView;
            long m116581d;
            long m116581d2;
            if (abstractC7999c instanceof AbstractC7999c.d) {
                DownloadToForwardDialog downloadToForwardDialog = DownloadToForwardDialog.this;
                AbstractC19074t.m100205c(abstractC7999c);
                downloadToForwardDialog.m42889eL((AbstractC7999c.d) abstractC7999c);
                return;
            }
            if (abstractC7999c instanceof AbstractC7999c.c) {
                m116581d2 = AbstractC22543l.m116581d(C23793c.Companion.m124321a().mo124319c() - DownloadToForwardDialog.this.f43475K0, 0L);
                List<C17945a0> list = DownloadToForwardDialog.this.f43474J0;
                if (list != null) {
                    for (C17945a0 c17945a0 : list) {
                        if (c17945a0.m95050X2() == null) {
                            c17945a0.m95237qa(new C25496a(0L, 0L, false, 7, null));
                        }
                        C25496a m95050X2 = c17945a0.m95050X2();
                        m95050X2.m132096f(m116581d2);
                        m95050X2.m132094d(true);
                    }
                }
                DownloadToForwardDialog.this.m42891gL(true);
                DownloadToForwardDialog.this.dismiss();
                return;
            }
            if (abstractC7999c instanceof AbstractC7999c.e) {
                AbstractC7999c.e eVar = (AbstractC7999c.e) abstractC7999c;
                if (eVar.m43068c()) {
                    m116581d = AbstractC22543l.m116581d(C23793c.Companion.m124321a().mo124319c() - DownloadToForwardDialog.this.f43475K0, 0L);
                    List<C17945a0> list2 = DownloadToForwardDialog.this.f43474J0;
                    if (list2 != null) {
                        for (C17945a0 c17945a02 : list2) {
                            if (c17945a02.m95050X2() == null) {
                                c17945a02.m95237qa(new C25496a(0L, 0L, false, 7, null));
                            }
                            C25496a m95050X22 = c17945a02.m95050X2();
                            m95050X22.m132096f(m116581d);
                            m95050X22.m132094d(false);
                        }
                    }
                    DownloadToForwardDialog.this.m42891gL(false);
                    DownloadToForwardDialog.this.m42893iL().m43096j0();
                }
                DownloadToForwardDialog downloadToForwardDialog2 = DownloadToForwardDialog.this;
                AbstractC19074t.m100205c(abstractC7999c);
                downloadToForwardDialog2.m42890fL(eVar);
                return;
            }
            if (AbstractC19074t.m100204b(abstractC7999c, AbstractC7999c.a.f43718a)) {
                DownloadToForwardDialog.this.dismiss();
                return;
            }
            if (AbstractC19074t.m100204b(abstractC7999c, AbstractC7999c.b.f43719a)) {
                ZaloView m92650VI = DownloadToForwardDialog.this.m92650VI();
                if (m92650VI instanceof ShareView) {
                    shareView = (ShareView) m92650VI;
                } else {
                    shareView = null;
                }
                if (shareView != null) {
                    shareView.m87579oN();
                }
                DownloadToForwardDialog.this.dismiss();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m42900a((AbstractC7999c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.DownloadToForwardDialog$d */
    /* loaded from: classes3.dex */
    public static final class C7974d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f43478p;

        C7974d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f43478p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f43478p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f43478p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.dialog.DownloadToForwardDialog$e */
    /* loaded from: classes3.dex */
    public static final class C7975e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f43479q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7975e(ZaloView zaloView) {
            super(0);
            this.f43479q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f43479q;
        }
    }

    /* renamed from: com.zing.zalo.dialog.DownloadToForwardDialog$f */
    /* loaded from: classes3.dex */
    public static final class C7976f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f43480q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7976f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f43480q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f43480q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eL */
    public final void m42889eL(AbstractC7999c.d dVar) {
        C30129y2 m42892hL = m42892hL();
        m42892hL.f139993r.setProgress(dVar.m43065a());
        ProgressBar progressBar = m42892hL.f139993r;
        AbstractC19074t.m100207e(progressBar, "progressBar");
        AbstractC26423o.m136269c(progressBar);
        AppCompatImageView appCompatImageView = m42892hL.f139994s;
        AbstractC19074t.m100207e(appCompatImageView, "stateIcon");
        AbstractC26423o.m136267a(appCompatImageView);
        m42892hL.f139995t.setText(AbstractC8020f0.d2f_preparing);
        m42892hL.f139992q.setText(AbstractC8020f0.cancel);
        Button button = m42892hL.f139992q;
        AbstractC19074t.m100207e(button, "actionButton");
        AbstractC26423o.m136269c(button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public final void m42890fL(AbstractC7999c.e eVar) {
        String m118743r0;
        int m43066a = eVar.m43066a();
        int m43069d = eVar.m43069d();
        C30129y2 m42892hL = m42892hL();
        ProgressBar progressBar = m42892hL.f139993r;
        AbstractC19074t.m100207e(progressBar, "progressBar");
        AbstractC26423o.m136267a(progressBar);
        AppCompatImageView appCompatImageView = m42892hL.f139994s;
        AbstractC19074t.m100207e(appCompatImageView, "stateIcon");
        AbstractC26423o.m136269c(appCompatImageView);
        RobotoTextView robotoTextView = m42892hL.f139995t;
        switch (C7972b.f43476a[eVar.m43067b().ordinal()]) {
            case 1:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_file_expired);
                break;
            case 2:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_file_rolled);
                break;
            case 3:
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.d2f_file_exceed_limit_size, Integer.valueOf(AbstractC23309i.m121231Nd()));
                break;
            case 4:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_video_failed);
                break;
            case 5:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_video_expired);
                break;
            case 6:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_video_rolled);
                break;
            case 7:
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.d2f_video_exceed_limit_size, Integer.valueOf(AbstractC26689j.m137115x(0)));
                break;
            case 8:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_unstable_connection);
                break;
            case 9:
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.d2f_multi_mesages_failed, Integer.valueOf(m43066a), Integer.valueOf(m43069d));
                break;
            default:
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_file_failed);
                break;
        }
        robotoTextView.setText(m118743r0);
        m42892hL.f139992q.setText(AbstractC8020f0.str_btn_popup_friend);
        Button button = m42892hL.f139992q;
        AbstractC19074t.m100207e(button, "actionButton");
        AbstractC26423o.m136269c(button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gL */
    public final void m42891gL(boolean z11) {
        ShareView shareView;
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ShareView) {
            shareView = (ShareView) m92650VI;
        } else {
            shareView = null;
        }
        if (shareView != null) {
            shareView.m87575TO(z11);
        }
    }

    /* renamed from: hL */
    private final C30129y2 m42892hL() {
        C30129y2 c30129y2 = this.f43472H0;
        AbstractC19074t.m100205c(c30129y2);
        return c30129y2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iL */
    public final C8000d m42893iL() {
        return (C8000d) this.f43473I0.getValue();
    }

    /* renamed from: jL */
    private final void m42894jL() {
        Button button = m42892hL().f139992q;
        button.setIdTracking("download_to_forward_action_button");
        button.setOnClickListener(new View.OnClickListener() { // from class: bn.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadToForwardDialog.m42895kL(DownloadToForwardDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kL */
    public static final void m42895kL(DownloadToForwardDialog downloadToForwardDialog, View view) {
        AbstractC19074t.m100208f(downloadToForwardDialog, "this$0");
        downloadToForwardDialog.m42893iL().m43095i0();
    }

    /* renamed from: lL */
    public static final DownloadToForwardDialog m42896lL(List list) {
        return Companion.m42899a(list);
    }

    /* renamed from: mL */
    private final void m42897mL() {
        m42893iL().m43094f0().m9219j(m92657cJ(), new C7974d(new C7973c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nL */
    public final void m42898nL(List list) {
        this.f43474J0 = list;
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f43475K0 = C23793c.Companion.m124321a().mo124319c();
        List list = this.f43474J0;
        if (list != null) {
            m42893iL().m43097m0(list);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f43472H0 = C30129y2.m148720c(layoutInflater);
        LinearLayout root = m42892hL().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f43472H0 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m42894jL();
        m42897mL();
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.c
    /* renamed from: p7 */
    public void mo13013p7(InterfaceC17463d interfaceC17463d) {
        m42893iL().m43095i0();
        super.mo13013p7(interfaceC17463d);
    }
}
