package com.zing.zalo.dialog;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.LikesDialogView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p243ip.C20647c;
import p243ip.C20648d;
import p243ip.C20649e;
import p243ip.InterfaceC20645a;
import p243ip.InterfaceC20646b;
import p330lp.C22633a;
import p330lp.C22634b;
import p330lp.C22635c;
import p330lp.C22636d;
import p716zh.C32002l4;
import v20.C27482j;

/* loaded from: classes3.dex */
public class LikesDialogView extends DialogView implements InterfaceC20646b {

    /* renamed from: H0 */
    Handler f43548H0 = new Handler(Looper.getMainLooper());

    /* renamed from: I0 */
    LinearLayout f43549I0;

    /* renamed from: J0 */
    LinearLayout f43550J0;

    /* renamed from: K0 */
    RobotoTextView f43551K0;

    /* renamed from: L0 */
    LinearLayoutManager f43552L0;

    /* renamed from: M0 */
    RecyclerView f43553M0;

    /* renamed from: N0 */
    TextView f43554N0;

    /* renamed from: O0 */
    C27482j f43555O0;

    /* renamed from: P0 */
    String f43556P0;

    /* renamed from: Q0 */
    boolean f43557Q0;

    /* renamed from: R0 */
    C7989c f43558R0;

    /* renamed from: S0 */
    InterfaceC20645a f43559S0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.LikesDialogView$a */
    /* loaded from: classes3.dex */
    public class C7987a extends RecyclerView.AbstractC1892s {
        C7987a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            LikesDialogView likesDialogView;
            C27482j c27482j;
            super.mo10176d(recyclerView, i11, i12);
            if (LikesDialogView.this.f43552L0.m9745c2() >= LikesDialogView.this.f43552L0.m10127i() - 1 && (c27482j = (likesDialogView = LikesDialogView.this).f43555O0) != null && !c27482j.f129265v && i12 != 0) {
                likesDialogView.f43559S0.mo107591ec();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.LikesDialogView$b */
    /* loaded from: classes3.dex */
    public class C7988b implements C27482j.a {

        /* renamed from: a */
        final /* synthetic */ C7989c f43561a;

        C7988b(C7989c c7989c) {
            this.f43561a = c7989c;
        }

        @Override // v20.C27482j.a
        /* renamed from: a */
        public boolean mo42996a(String str) {
            InterfaceC7990d interfaceC7990d = this.f43561a.f43569g;
            if (interfaceC7990d != null) {
                return interfaceC7990d.mo43009a(str);
            }
            return false;
        }

        @Override // v20.C27482j.a
        /* renamed from: b */
        public void mo42997b() {
            LikesDialogView.this.f43559S0.mo107594wb();
        }

        @Override // v20.C27482j.a
        /* renamed from: c */
        public void mo42998c(String str) {
            FeedActionZUtils.m47567y(LikesDialogView.this.m92676n2(), str);
        }

        @Override // v20.C27482j.a
        /* renamed from: d */
        public void mo42999d(String str, TrackingSource trackingSource) {
            FeedActionZUtils.m47568z(LikesDialogView.this.m92676n2(), str, trackingSource, this.f43561a.f43576n);
        }
    }

    /* renamed from: com.zing.zalo.dialog.LikesDialogView$c */
    /* loaded from: classes3.dex */
    public static class C7989c {

        /* renamed from: a */
        Context f43563a;

        /* renamed from: b */
        String f43564b;

        /* renamed from: c */
        boolean f43565c;

        /* renamed from: d */
        String f43566d;

        /* renamed from: e */
        InterfaceC17463d.d f43567e;

        /* renamed from: f */
        TrackingSource f43568f;

        /* renamed from: g */
        InterfaceC7990d f43569g;

        /* renamed from: h */
        int f43570h;

        /* renamed from: i */
        String f43571i;

        /* renamed from: j */
        String f43572j;

        /* renamed from: k */
        String f43573k;

        /* renamed from: l */
        String f43574l;

        /* renamed from: m */
        int f43575m;

        /* renamed from: n */
        C32002l4 f43576n = C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_AUDIO_SEEK_RENDERING_START);

        public C7989c(Context context) {
            this.f43563a = context;
        }

        /* renamed from: a */
        public C7989c m43000a(InterfaceC7990d interfaceC7990d) {
            this.f43569g = interfaceC7990d;
            return this;
        }

        /* renamed from: b */
        public C7989c m43001b(String str) {
            this.f43571i = str;
            return this;
        }

        /* renamed from: c */
        public C7989c m43002c(int i11) {
            this.f43570h = i11;
            return this;
        }

        /* renamed from: d */
        public C7989c m43003d(String str) {
            this.f43573k = str;
            return this;
        }

        /* renamed from: e */
        public C7989c m43004e(String str) {
            this.f43572j = str;
            return this;
        }

        /* renamed from: f */
        public C7989c m43005f(String str, InterfaceC17463d.d dVar) {
            this.f43566d = str;
            this.f43567e = dVar;
            return this;
        }

        /* renamed from: g */
        public C7989c m43006g(int i11) {
            this.f43575m = i11;
            return this;
        }

        /* renamed from: h */
        public C7989c m43007h(String str) {
            this.f43564b = str;
            return this;
        }

        /* renamed from: i */
        public C7989c m43008i(TrackingSource trackingSource) {
            this.f43568f = trackingSource;
            return this;
        }
    }

    /* renamed from: com.zing.zalo.dialog.LikesDialogView$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC7990d {
        /* renamed from: a */
        boolean mo43009a(String str);
    }

    /* renamed from: YK */
    public static LikesDialogView m42991YK(C7989c c7989c) {
        LikesDialogView likesDialogView = new LikesDialogView();
        likesDialogView.f43558R0 = c7989c;
        return likesDialogView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public /* synthetic */ void m42992ZK(C7989c c7989c, View view) {
        InterfaceC17463d.d dVar = c7989c.f43567e;
        if (dVar != null) {
            dVar.mo605K8(m92594JK(), -1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        try {
            this.f43559S0.mo107592n();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        C7989c c7989c = this.f43558R0;
        if (c7989c == null) {
            dismiss();
            return super.mo13885LK(bundle);
        }
        return m42993XK(c7989c);
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        super.mo12457Tv(interfaceC17463d);
    }

    /* renamed from: XK */
    public KeyEventCallbackC17462c m42993XK(final C7989c c7989c) {
        if (c7989c == null) {
            return null;
        }
        KeyEventCallbackC17462c keyEventCallbackC17462c = new KeyEventCallbackC17462c(c7989c.f43563a, AbstractC8915g0.Theme_Dialog_Translucent);
        keyEventCallbackC17462c.m92870v(1);
        this.f43559S0 = new C20647c(this, new C22634b(), new C22635c(), new C22633a(), new C22636d());
        try {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
            if (layoutInflater != null) {
                View inflate = layoutInflater.inflate(AbstractC7409c0.likes_dialog, (ViewGroup) null);
                keyEventCallbackC17462c.m92852C(inflate, new ViewGroup.LayoutParams(-1, -2));
                View m92904k = keyEventCallbackC17462c.m92867k().m92904k();
                int i11 = AbstractC23222t7.f112514B;
                m92904k.setPadding(0, i11, 0, i11);
                TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.confirm_title);
                this.f43554N0 = textView;
                if (textView != null) {
                    textView.setText(c7989c.f43564b);
                }
                Button button = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_yes);
                if (button != null) {
                    button.setText(c7989c.f43566d.toUpperCase());
                    button.setOnClickListener(new View.OnClickListener() { // from class: bn.y0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LikesDialogView.this.m42992ZK(c7989c, view);
                        }
                    });
                }
                this.f43549I0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.layoutLikesLoading);
                this.f43550J0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.layoutLikesEmptyOrError);
                this.f43551K0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvLikesEmptyOrError);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(AbstractC6918a0.likesListview);
                this.f43553M0 = recyclerView;
                recyclerView.m9826E(new C7987a());
                C27482j c27482j = new C27482j(getContext());
                this.f43555O0 = c27482j;
                c27482j.m140566W(new C7988b(c7989c));
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                this.f43552L0 = linearLayoutManager;
                this.f43553M0.setLayoutManager(linearLayoutManager);
                this.f43553M0.setAdapter(this.f43555O0);
                this.f43557Q0 = c7989c.f43565c;
                this.f43556P0 = c7989c.f43573k;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return keyEventCallbackC17462c;
    }

    @Override // p243ip.InterfaceC20646b
    /* renamed from: dC */
    public void mo42994dC(C20649e c20649e) {
        if (c20649e == null) {
            return;
        }
        try {
            int m107631c = c20649e.m107631c();
            if (m107631c != 0) {
                if (m107631c != 1) {
                    if (m107631c == 2) {
                        AbstractC23136l9.m118744r1(this.f43553M0, 0);
                        AbstractC23136l9.m118744r1(this.f43550J0, 8);
                        AbstractC23136l9.m118744r1(this.f43549I0, 8);
                        C27482j c27482j = this.f43555O0;
                        if (c27482j != null) {
                            c27482j.m140568Y(false);
                            this.f43555O0.m140567X(true);
                        }
                    }
                } else {
                    AbstractC23136l9.m118744r1(this.f43553M0, 0);
                    AbstractC23136l9.m118744r1(this.f43550J0, 8);
                    AbstractC23136l9.m118744r1(this.f43549I0, 8);
                    C27482j c27482j2 = this.f43555O0;
                    if (c27482j2 != null) {
                        c27482j2.m140568Y(true);
                        this.f43555O0.m140567X(false);
                    }
                }
            } else {
                AbstractC23136l9.m118744r1(this.f43553M0, 0);
                AbstractC23136l9.m118744r1(this.f43550J0, 8);
                AbstractC23136l9.m118744r1(this.f43549I0, 8);
                C27482j c27482j3 = this.f43555O0;
                if (c27482j3 != null) {
                    c27482j3.m140568Y(false);
                    this.f43555O0.m140567X(false);
                }
            }
            switch (c20649e.m107629a()) {
                case 10:
                    AbstractC23136l9.m118744r1(this.f43550J0, 0);
                    AbstractC23136l9.m118744r1(this.f43549I0, 8);
                    AbstractC23136l9.m118744r1(this.f43553M0, 8);
                    RobotoTextView robotoTextView = this.f43551K0;
                    if (robotoTextView != null) {
                        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_likes_dialog_empty));
                        break;
                    }
                    break;
                case 11:
                    AbstractC23136l9.m118744r1(this.f43549I0, 0);
                    AbstractC23136l9.m118744r1(this.f43550J0, 8);
                    AbstractC23136l9.m118744r1(this.f43553M0, 8);
                    break;
                case 12:
                    AbstractC23136l9.m118744r1(this.f43550J0, 0);
                    AbstractC23136l9.m118744r1(this.f43549I0, 8);
                    AbstractC23136l9.m118744r1(this.f43553M0, 8);
                    RobotoTextView robotoTextView2 = this.f43551K0;
                    if (robotoTextView2 != null) {
                        robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_likes_dialog_error));
                        break;
                    }
                    break;
            }
            if (this.f43554N0 != null && !TextUtils.isEmpty(c20649e.m107633e())) {
                this.f43554N0.setText(c20649e.m107633e());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // p243ip.InterfaceC20646b
    /* renamed from: jB */
    public void mo42995jB(String str) {
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        try {
            super.mo37135xJ(bundle);
            Bundle bundle2 = new Bundle();
            C7989c c7989c = this.f43558R0;
            if (c7989c != null) {
                bundle2.putString("EXTRA_LIKE_FEED_ID", c7989c.f43571i);
                bundle2.putString("EXTRA_LIKE_PHOTO_ID", this.f43558R0.f43572j);
                bundle2.putString("EXTRA_LIKE_COMMENT_ID", this.f43558R0.f43574l);
                bundle2.putInt("EXTRA_LIKE_SOURCE_OPEN", this.f43558R0.f43575m);
                bundle2.putInt("EXTRA_LIKE_MODE", this.f43558R0.f43570h);
                this.f43559S0.mo995Nd(C20648d.m107627a(bundle2), null);
                this.f43559S0.mo107593r1();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
