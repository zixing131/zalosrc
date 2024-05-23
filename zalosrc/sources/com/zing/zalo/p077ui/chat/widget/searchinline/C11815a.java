package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.WebAppInterface;
import com.zing.zalo.feed.uicontrols.TypographyView;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.chat.widget.searchinline.C11815a;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowAction;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowBanner;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowCommand;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowGif;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowLocation;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowMusic;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowPhotoSticker;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowSticker;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zview.AbstractC17466e;
import g30.AbstractC19215a;
import g30.C19216b;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p193h0.AbstractC19694b;
import p268ji.C21270p;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p611wj.C29054b;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31902e9;
import p732zy.C32596l;

/* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a */
/* loaded from: classes5.dex */
public class C11815a extends RecyclerView.AbstractC1880g {

    /* renamed from: C */
    public static final int f61479C = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 40.0f);

    /* renamed from: D */
    private static final int f61480D = AbstractC6918a0.tag_suggest_item_position;

    /* renamed from: A */
    private String f61481A;

    /* renamed from: s */
    private final g f61484s;

    /* renamed from: t */
    private final int f61485t;

    /* renamed from: x */
    private ViewGroup f61489x;

    /* renamed from: y */
    private final C23528a f61490y;

    /* renamed from: z */
    private AbstractC19215a f61491z;

    /* renamed from: u */
    private boolean f61486u = false;

    /* renamed from: v */
    private int f61487v = -1;

    /* renamed from: w */
    private int f61488w = 0;

    /* renamed from: B */
    private boolean f61482B = false;

    /* renamed from: r */
    private List f61483r = new ArrayList();

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a$a */
    /* loaded from: classes5.dex */
    class a implements SearchRowSticker.InterfaceC11814b {
        a() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowSticker.InterfaceC11814b
        /* renamed from: a */
        public boolean mo65662a() {
            if (!C11815a.this.f61484s.mo56866a() && !C11815a.this.f61486u) {
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowSticker.InterfaceC11814b
        /* renamed from: b */
        public boolean mo65663b() {
            return C11815a.this.m65700e0();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowSticker.InterfaceC11814b
        /* renamed from: c */
        public void mo65664c(C31902e9 c31902e9) {
            C11815a.this.f61484s.mo56872i3(c31902e9);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowSticker.InterfaceC11814b
        /* renamed from: d */
        public void mo65665d(View view, C31902e9 c31902e9) {
            int i11;
            if (view.getTag(C11815a.f61480D) instanceof Integer) {
                i11 = ((Integer) view.getTag(C11815a.f61480D)).intValue();
            } else {
                i11 = -1;
            }
            C11815a.this.f61484s.mo56871f(c31902e9, i11, C11815a.this.m65686g0(), C11815a.this.f61487v, C11815a.this.f61491z);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowSticker.InterfaceC11814b
        /* renamed from: e */
        public void mo65666e(C31902e9 c31902e9) {
            C11815a.this.f61484s.mo56865I2(c31902e9);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowSticker.InterfaceC11814b
        /* renamed from: f */
        public void mo65667f(View view, C31902e9 c31902e9) {
            int i11;
            if (view.getTag(C11815a.f61480D) instanceof Integer) {
                i11 = ((Integer) view.getTag(C11815a.f61480D)).intValue();
            } else {
                i11 = -1;
            }
            C11815a c11815a = C11815a.this;
            c11815a.m65698y0(c11815a.f61491z);
            C11815a.this.f61484s.mo56869d(c31902e9, i11, C11815a.this.m65686g0(), C11815a.this.f61487v);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a$b */
    /* loaded from: classes5.dex */
    class b implements SearchRowGif.InterfaceC11805a {
        b() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowGif.InterfaceC11805a
        /* renamed from: a */
        public void mo65629a(View view, C31902e9 c31902e9) {
            int i11;
            if (view.getTag(C11815a.f61480D) instanceof Integer) {
                i11 = ((Integer) view.getTag(C11815a.f61480D)).intValue();
            } else {
                i11 = -1;
            }
            C11815a c11815a = C11815a.this;
            c11815a.m65698y0(c11815a.f61491z);
            C11815a.this.f61484s.mo56869d(c31902e9, i11, C11815a.this.m65686g0(), C11815a.this.f61487v);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowGif.InterfaceC11805a
        /* renamed from: b */
        public boolean mo65630b() {
            return C11815a.this.m65700e0();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowGif.InterfaceC11805a
        /* renamed from: c */
        public void mo65631c(C31902e9 c31902e9) {
            C11815a.this.f61484s.mo56872i3(c31902e9);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowGif.InterfaceC11805a
        /* renamed from: d */
        public void mo65632d(View view, C31902e9 c31902e9) {
            int i11;
            if (view.getTag(C11815a.f61480D) instanceof Integer) {
                i11 = ((Integer) view.getTag(C11815a.f61480D)).intValue();
            } else {
                i11 = -1;
            }
            C11815a.this.f61484s.mo56871f(c31902e9, i11, C11815a.this.m65686g0(), C11815a.this.f61487v, C11815a.this.f61491z);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowGif.InterfaceC11805a
        /* renamed from: e */
        public void mo65633e(C31902e9 c31902e9) {
            C11815a.this.f61484s.mo56865I2(c31902e9);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a$c */
    /* loaded from: classes5.dex */
    class c implements SearchRowPhotoSticker.InterfaceC11812b {
        c() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowPhotoSticker.InterfaceC11812b
        /* renamed from: a */
        public boolean mo65650a() {
            if (!C11815a.this.f61484s.mo56866a() && !C11815a.this.f61486u) {
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowPhotoSticker.InterfaceC11812b
        /* renamed from: b */
        public boolean mo65651b() {
            return C11815a.this.m65700e0();
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowPhotoSticker.InterfaceC11812b
        /* renamed from: c */
        public void mo65652c(C31902e9 c31902e9) {
            C11815a.this.f61484s.mo56865I2(c31902e9);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowPhotoSticker.InterfaceC11812b
        /* renamed from: d */
        public void mo65653d(C31902e9 c31902e9) {
            C11815a.this.f61484s.mo56872i3(c31902e9);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowPhotoSticker.InterfaceC11812b
        /* renamed from: e */
        public void mo65654e(View view, C31902e9 c31902e9) {
            int i11;
            if (view.getTag(C11815a.f61480D) instanceof Integer) {
                i11 = ((Integer) view.getTag(C11815a.f61480D)).intValue();
            } else {
                i11 = -1;
            }
            C11815a.this.f61484s.mo56871f(c31902e9, i11, C11815a.this.m65686g0(), C11815a.this.f61487v, C11815a.this.f61491z);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowPhotoSticker.InterfaceC11812b
        /* renamed from: f */
        public void mo65655f(View view, C31902e9 c31902e9) {
            int i11;
            if (view.getTag(C11815a.f61480D) instanceof Integer) {
                i11 = ((Integer) view.getTag(C11815a.f61480D)).intValue();
            } else {
                i11 = -1;
            }
            C11815a c11815a = C11815a.this;
            c11815a.m65698y0(c11815a.f61491z);
            C11815a.this.f61484s.mo56869d(c31902e9, i11, C11815a.this.m65686g0(), C11815a.this.f61487v);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a$d */
    /* loaded from: classes5.dex */
    class d implements SearchRowBanner.InterfaceC11803b {
        d() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowBanner.InterfaceC11803b
        /* renamed from: a */
        public void mo65622a(View view, C31902e9 c31902e9) {
            int i11;
            if (view.getTag(C11815a.f61480D) instanceof Integer) {
                i11 = ((Integer) view.getTag(C11815a.f61480D)).intValue();
            } else {
                i11 = -1;
            }
            C11815a.this.f61484s.mo56869d(c31902e9, i11, C11815a.this.m65686g0(), C11815a.this.f61487v);
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowBanner.InterfaceC11803b
        /* renamed from: b */
        public void mo65623b() {
            C11815a.this.f61484s.mo56868c();
            AbstractC23647d.m123897g("91998714");
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a$e */
    /* loaded from: classes5.dex */
    public static class e extends RecyclerView.AbstractC1876c0 {
        public e(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void m65707i0() {
            View view = this.f7784p;
            if (view instanceof SearchRow) {
                ((SearchRow) view).mo65614e();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a$f */
    /* loaded from: classes5.dex */
    private static class f extends e {

        /* renamed from: I */
        RobotoTextView f61496I;

        /* renamed from: J */
        RobotoTextView f61497J;

        /* renamed from: K */
        RecyclingImageView f61498K;

        /* renamed from: L */
        View f61499L;

        public f(View view) {
            super(view);
            this.f61496I = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_title);
            this.f61497J = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_message);
            this.f61498K = (RecyclingImageView) view.findViewById(AbstractC6918a0.thumb_image);
            this.f61499L = view.findViewById(AbstractC6918a0.btm_separator_line);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.a$g */
    /* loaded from: classes5.dex */
    public interface g {
        /* renamed from: I2 */
        void mo56865I2(C31902e9 c31902e9);

        /* renamed from: a */
        boolean mo56866a();

        /* renamed from: b */
        void mo56867b();

        /* renamed from: c */
        void mo56868c();

        /* renamed from: d */
        void mo56869d(C31902e9 c31902e9, int i11, int i12, int i13);

        /* renamed from: e */
        void mo56870e();

        /* renamed from: f */
        void mo56871f(C31902e9 c31902e9, int i11, int i12, int i13, AbstractC19215a abstractC19215a);

        /* renamed from: i3 */
        void mo56872i3(C31902e9 c31902e9);
    }

    public C11815a(Context context, int i11, g gVar, String str) {
        this.f61481A = "";
        this.f61490y = new C23528a(context);
        this.f61485t = i11;
        this.f61484s = gVar;
        this.f61481A = str;
    }

    /* renamed from: c0 */
    private int m65685c0() {
        int i11 = 0;
        for (int size = this.f61483r.size() - 1; size >= 0; size--) {
            C31902e9 c31902e9 = (C31902e9) this.f61483r.get(size);
            if ((c31902e9.m153322n() == 0 && c31902e9.m153321m() != null && c31902e9.m153321m().m132429g() == -100) || c31902e9.m153322n() == -102) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public int m65686g0() {
        return mo10003k() - this.f61488w;
    }

    /* renamed from: i0 */
    private boolean m65687i0() {
        return this.f61485t == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m65688j0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        LinearLayout linearLayout = (LinearLayout) abstractC1876c0.f7784p;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = this.f61489x.getMeasuredHeight();
        linearLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m65689k0(C31902e9 c31902e9, int i11, View view) {
        this.f61484s.mo56869d(c31902e9, i11, m65686g0(), this.f61487v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m65690l0(int i11, View view) {
        this.f61484s.mo56869d(m65701f0(i11), i11, m65686g0(), this.f61487v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m65691m0(View view, C31902e9 c31902e9) {
        int i11;
        int i12 = f61480D;
        if (view.getTag(i12) instanceof Integer) {
            i11 = ((Integer) view.getTag(i12)).intValue();
        } else {
            i11 = -1;
        }
        this.f61484s.mo56869d(c31902e9, i11, m65686g0(), this.f61487v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m65692o0(View view, C31902e9 c31902e9) {
        int i11;
        int i12 = f61480D;
        if (view.getTag(i12) instanceof Integer) {
            i11 = ((Integer) view.getTag(i12)).intValue();
        } else {
            i11 = -1;
        }
        this.f61484s.mo56869d(c31902e9, i11, m65686g0(), this.f61487v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m65693p0(View view, C31902e9 c31902e9) {
        int i11;
        int i12 = f61480D;
        if (view.getTag(i12) instanceof Integer) {
            i11 = ((Integer) view.getTag(i12)).intValue();
        } else {
            i11 = -1;
        }
        this.f61484s.mo56869d(c31902e9, i11, m65686g0(), this.f61487v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m65694q0(View view, C31902e9 c31902e9, int i11) {
        int i12;
        int i13;
        int i14 = f61480D;
        if (view.getTag(i14) instanceof Integer) {
            i12 = ((Integer) view.getTag(i14)).intValue();
        } else {
            i12 = -1;
        }
        this.f61484s.mo56869d(c31902e9, i12, m65686g0(), this.f61487v);
        Object[] objArr = new Object[1];
        if (i11 < 3) {
            i13 = i11 + 1;
        } else {
            i13 = 4;
        }
        objArr[0] = Integer.valueOf(i13);
        AbstractC23647d.m123897g(String.format("100030%d", objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m65695r0(View view) {
        this.f61484s.mo56868c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m65696s0(View view) {
        this.f61484s.mo56870e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m65697t0(View view) {
        int i11;
        if (view.getTag() instanceof C31902e9) {
            int i12 = f61480D;
            if (view.getTag(i12) instanceof Integer) {
                i11 = ((Integer) view.getTag(i12)).intValue();
            } else {
                i11 = -1;
            }
            this.f61484s.mo56869d((C31902e9) view.getTag(), i11, m65686g0(), this.f61487v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m65698y0(AbstractC19215a abstractC19215a) {
        if (abstractC19215a instanceof C19216b) {
            C19216b c19216b = (C19216b) abstractC19215a;
            c19216b.m100856o(1);
            C21270p.m110079C().m110148T(c19216b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(final RecyclerView.AbstractC1876c0 abstractC1876c0, final int i11) {
        C31890dc c31890dc;
        C32596l m153317i;
        C32596l.c.C33080c m157839b;
        try {
            switch (abstractC1876c0.m9931C()) {
                case 1:
                    ((SearchRowSticker) abstractC1876c0.f7784p).setSearchResult((C31902e9) this.f61483r.get(i11));
                    break;
                case 2:
                    ((SearchRowGif) abstractC1876c0.f7784p).m65628m((C31902e9) this.f61483r.get(i11), i11);
                    break;
                case 3:
                    ((SearchRowMusic) abstractC1876c0.f7784p).setSearchResult((C31902e9) this.f61483r.get(i11));
                    break;
                case 4:
                    ((SearchRowBanner) abstractC1876c0.f7784p).setSearchResult((C31902e9) this.f61483r.get(i11));
                    break;
                case 5:
                    ((SearchRowLocation) abstractC1876c0.f7784p).setSearchResult((C31902e9) this.f61483r.get(i11));
                    break;
                case 6:
                    ((SearchRowAction) abstractC1876c0.f7784p).setSearchResult((C31902e9) this.f61483r.get(i11));
                    break;
                case 7:
                case 9:
                    ((SearchRowCommand) abstractC1876c0.f7784p).m65625b((C31902e9) this.f61483r.get(i11), i11);
                    break;
                case 8:
                    ((TextView) abstractC1876c0.f7784p).setText(((C31902e9) this.f61483r.get(i11)).m153319k().m153222l());
                    break;
                case 10:
                    abstractC1876c0.f7784p.post(new Runnable() { // from class: s60.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11815a.this.m65688j0(abstractC1876c0);
                        }
                    });
                    break;
                case 11:
                    ((SearchRowPhotoSticker) abstractC1876c0.f7784p).setSearchResult((C31902e9) this.f61483r.get(i11));
                    break;
                case 12:
                    TypographyView typographyView = (TypographyView) abstractC1876c0.f7784p;
                    typographyView.setTag(m65701f0(i11));
                    C31890dc m153323o = m65701f0(i11).m153323o();
                    if (m65701f0(i11).m153326r()) {
                        c31890dc = m153323o;
                    } else {
                        c31890dc = null;
                    }
                    typographyView.m47325b(m153323o, false, c31890dc);
                    if (m153323o != null && !m153323o.m153250u()) {
                        C31845ac.m152996J().m153057o0(m153323o.f146495a, null);
                        break;
                    }
                    break;
                case 14:
                    if (abstractC1876c0 instanceof f) {
                        final C31902e9 m65701f0 = m65701f0(i11);
                        if (m65701f0.m153322n() == 10 && (m153317i = m65701f0.m153317i()) != null) {
                            abstractC1876c0.f7784p.setOnClickListener(new View.OnClickListener() { // from class: s60.i
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C11815a.this.m65689k0(m65701f0, i11, view);
                                }
                            });
                            ((f) abstractC1876c0).f61496I.setText("/" + m153317i.m157831f());
                            ((f) abstractC1876c0).f61497J.setText(m153317i.m157829d());
                            if (m153317i.m157835j() != 1) {
                                ((f) abstractC1876c0).f61498K.setVisibility(8);
                            } else {
                                RecyclingImageView recyclingImageView = ((f) abstractC1876c0).f61498K;
                                recyclingImageView.setVisibility(0);
                                recyclingImageView.setImageResource(AbstractC16803z.no_image2);
                                if (this.f61490y != null && m153317i.m157833h() != null && (m157839b = m153317i.m157833h().m157839b()) != null) {
                                    ((C23528a) this.f61490y.m123612r(recyclingImageView)).m123618x(m157839b.m157852g(), C23278z2.m120122e());
                                }
                            }
                        } else {
                            ((f) abstractC1876c0).f61496I.setText("");
                            ((f) abstractC1876c0).f61497J.setText("");
                            ((f) abstractC1876c0).f61498K.setVisibility(8);
                            abstractC1876c0.f7784p.setOnClickListener(null);
                        }
                        if (i11 > 0) {
                            ((f) abstractC1876c0).f61499L.setVisibility(0);
                            break;
                        } else {
                            ((f) abstractC1876c0).f61499L.setVisibility(8);
                            break;
                        }
                    }
                    break;
                case 15:
                    abstractC1876c0.f7784p.setOnClickListener(new View.OnClickListener() { // from class: s60.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C11815a.this.m65690l0(i11, view);
                        }
                    });
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    ((SearchRowLockViewMemberTitle) abstractC1876c0.f7784p).m65638m((C31902e9) this.f61483r.get(i11), this.f61482B);
                    break;
            }
            abstractC1876c0.f7784p.setTag(f61480D, Integer.valueOf(i11));
            if (abstractC1876c0.m9931C() != 10) {
                this.f61487v = Math.max(this.f61487v, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        int i12;
        int i13;
        int i14;
        int m118742r;
        int i15;
        int m118742r2;
        this.f61489x = viewGroup;
        Drawable m118665N = AbstractC23136l9.m118665N(viewGroup.getContext(), AbstractC16803z.feed_overlaysuccess_bg);
        Drawable m118665N2 = AbstractC23136l9.m118665N(viewGroup.getContext(), AbstractC16803z.check_icon);
        if (m65687i0()) {
            i12 = AbstractC17466e.transparent;
        } else {
            i12 = AbstractC16803z.bg_sticker_suggest_profile;
        }
        int i16 = 0;
        View view = null;
        view = null;
        view = null;
        switch (i11) {
            case 1:
                int m118742r3 = AbstractC23136l9.m118742r(4.0f);
                if (m65687i0()) {
                    i13 = SearchRowSticker.f61465M;
                } else {
                    i13 = SearchRowSticker.f61466N;
                }
                SearchRowSticker searchRowSticker = new SearchRowSticker(viewGroup.getContext(), i13, new Rect(0, m118742r3, 0, m118742r3), this.f61481A);
                searchRowSticker.setEnableAnimOverlay(!m65687i0());
                searchRowSticker.m65617i(i12, m118665N, m118665N2);
                searchRowSticker.setListener(new a());
                view = searchRowSticker;
                break;
            case 2:
                if (m65687i0()) {
                    i14 = SearchRowGif.f61403L;
                } else {
                    i14 = SearchRowGif.f61404M;
                }
                if (!m65687i0()) {
                    i16 = AbstractC23136l9.m118742r(10.0f);
                }
                if (m65687i0()) {
                    m118742r = AbstractC23136l9.m118742r(4.0f);
                } else {
                    m118742r = AbstractC23136l9.m118742r(10.0f);
                }
                SearchRowGif searchRowGif = new SearchRowGif(viewGroup.getContext(), new Rect(i16, m118742r, i16, m118742r), 2, i14);
                searchRowGif.m65617i(i12, m118665N, m118665N2);
                searchRowGif.setEnableAnimOverlay(!m65687i0());
                searchRowGif.setListener(new b());
                view = searchRowGif;
                break;
            case 3:
                SearchRowMusic searchRowMusic = new SearchRowMusic(viewGroup.getContext(), new Rect(0, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(8.0f)));
                searchRowMusic.setListener(new SearchRowMusic.InterfaceC11810b() { // from class: s60.a
                    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowMusic.InterfaceC11810b
                    /* renamed from: a */
                    public final void mo65642a(View view2, C31902e9 c31902e9) {
                        C11815a.this.m65691m0(view2, c31902e9);
                    }
                });
                view = searchRowMusic;
                break;
            case 4:
                SearchRowBanner searchRowBanner = new SearchRowBanner(viewGroup.getContext());
                C29054b m153310b = ((C31902e9) this.f61483r.get(0)).m153310b();
                searchRowBanner.setLayoutParams(new RecyclerView.LayoutParams(-1, (viewGroup.getMeasuredWidth() * m153310b.m145103c()) / m153310b.m145105e()));
                searchRowBanner.setListener(new d());
                view = searchRowBanner;
                break;
            case 5:
                SearchRowLocation searchRowLocation = new SearchRowLocation(viewGroup.getContext());
                searchRowLocation.setListener(new SearchRowLocation.InterfaceC11807b() { // from class: s60.b
                    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowLocation.InterfaceC11807b
                    /* renamed from: a */
                    public final void mo65636a(View view2, C31902e9 c31902e9) {
                        C11815a.this.m65692o0(view2, c31902e9);
                    }
                });
                view = searchRowLocation;
                break;
            case 6:
                SearchRowAction searchRowAction = new SearchRowAction(viewGroup.getContext());
                searchRowAction.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                searchRowAction.setListener(new SearchRowAction.InterfaceC11801a() { // from class: s60.c
                    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowAction.InterfaceC11801a
                    /* renamed from: a */
                    public final void mo65621a(View view2, C31902e9 c31902e9) {
                        C11815a.this.m65693p0(view2, c31902e9);
                    }
                });
                view = searchRowAction;
                break;
            case 7:
            case 9:
                SearchRowCommand searchRowCommand = new SearchRowCommand(viewGroup.getContext());
                searchRowCommand.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                searchRowCommand.setListener(new SearchRowCommand.InterfaceC11804a() { // from class: s60.d
                    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRowCommand.InterfaceC11804a
                    /* renamed from: a */
                    public final void mo65626a(View view2, C31902e9 c31902e9, int i17) {
                        C11815a.this.m65694q0(view2, c31902e9, i17);
                    }
                });
                view = searchRowCommand;
                break;
            case 8:
                RobotoTextView robotoTextView = new RobotoTextView(viewGroup.getContext());
                robotoTextView.setGravity(17);
                robotoTextView.setTextColor(MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cMtxt2));
                robotoTextView.setTextSize(1, 14.0f);
                robotoTextView.setPadding(0, AbstractC23136l9.m118742r(10.0f), 0, AbstractC23136l9.m118742r(10.0f));
                robotoTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, AbstractC23136l9.m118742r(80.0f)));
                view = robotoTextView;
                break;
            case 10:
                LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, viewGroup.getMeasuredHeight()));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), 0);
                layoutParams.weight = 1.0f;
                StickerView stickerView = new StickerView(viewGroup.getContext());
                stickerView.setImageDrawable(AbstractC19694b.m103336d(viewGroup.getContext(), AbstractC16803z.btn_suggest_sticker_close));
                stickerView.setLayoutParams(layoutParams);
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
                stickerView.setScaleType(scaleType);
                stickerView.setOnClickListener(new View.OnClickListener() { // from class: s60.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C11815a.this.m65695r0(view2);
                    }
                });
                linearLayout.addView(stickerView);
                StickerView stickerView2 = new StickerView(viewGroup.getContext());
                stickerView2.setImageDrawable(AbstractC19694b.m103336d(viewGroup.getContext(), AbstractC16803z.btn_suggest_sticker_settings));
                stickerView2.setLayoutParams(layoutParams);
                stickerView2.setScaleType(scaleType);
                stickerView2.setOnClickListener(new View.OnClickListener() { // from class: s60.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C11815a.this.m65696s0(view2);
                    }
                });
                linearLayout.addView(stickerView2);
                view = linearLayout;
                break;
            case 11:
                if (m65687i0()) {
                    i15 = SearchRowPhotoSticker.f61453M;
                } else {
                    i15 = SearchRowPhotoSticker.f61454N;
                }
                if (!m65687i0()) {
                    i16 = AbstractC23136l9.m118742r(10.0f);
                }
                if (m65687i0()) {
                    m118742r2 = AbstractC23136l9.m118742r(4.0f);
                } else {
                    m118742r2 = AbstractC23136l9.m118742r(10.0f);
                }
                SearchRowPhotoSticker searchRowPhotoSticker = new SearchRowPhotoSticker(viewGroup.getContext(), new Rect(i16, m118742r2, i16, m118742r2), i15, this.f61481A);
                searchRowPhotoSticker.m65617i(i12, m118665N, m118665N2);
                searchRowPhotoSticker.setEnableAnimOverlay(!m65687i0());
                searchRowPhotoSticker.setListener(new c());
                view = searchRowPhotoSticker;
                break;
            case 12:
                TypographyView typographyView = new TypographyView(viewGroup.getContext());
                typographyView.m47324a(viewGroup.getContext());
                typographyView.setLayoutParams(new RecyclerView.LayoutParams(-2, AbstractC23136l9.m118742r(40.0f)));
                typographyView.setOnClickListener(new View.OnClickListener() { // from class: s60.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C11815a.this.m65697t0(view2);
                    }
                });
                view = typographyView;
                break;
            case 13:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
                ProgressBar progressBar = new ProgressBar(viewGroup.getContext());
                int m118742r4 = AbstractC23136l9.m118742r(24.0f);
                int m118742r5 = AbstractC23136l9.m118742r(8.0f);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m118742r4, m118742r4, 17);
                layoutParams2.setMargins(m118742r5, m118742r5, m118742r5, m118742r5);
                frameLayout.addView(progressBar, layoutParams2);
                view = frameLayout;
                break;
            case 14:
                Context context = viewGroup.getContext();
                if (context != null) {
                    return new f(LayoutInflater.from(context).inflate(AbstractC7409c0.quick_message_item_in_search_inline_layout, viewGroup, false));
                }
                break;
            case 15:
                Context context2 = viewGroup.getContext();
                if (context2 != null) {
                    view = LayoutInflater.from(context2).inflate(AbstractC7409c0.quick_message_suggestion_item_in_search_inline_layout, viewGroup, false);
                    break;
                }
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                view = new SearchRowLockViewMemberTitle(viewGroup.getContext(), this.f61484s);
                break;
        }
        return new e(view);
    }

    /* renamed from: d0 */
    public void m65699d0() {
        this.f61491z = null;
    }

    /* renamed from: e0 */
    public boolean m65700e0() {
        return this.f61486u;
    }

    /* renamed from: f0 */
    public C31902e9 m65701f0(int i11) {
        if (i11 < this.f61483r.size()) {
            return (C31902e9) this.f61483r.get(i11);
        }
        return null;
    }

    /* renamed from: h0 */
    public AbstractC19215a m65702h0() {
        return this.f61491z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f61483r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (this.f61483r.size() <= 0 || i11 < 0 || i11 >= this.f61483r.size()) {
            return 0;
        }
        C31902e9 c31902e9 = (C31902e9) this.f61483r.get(i11);
        int m153322n = c31902e9.m153322n();
        switch (m153322n) {
            case -102:
                return 16;
            case -101:
                return 8;
            case WebAppInterface.ERROR_PURCHASE_USER_CANCELED /* -100 */:
                return 7;
            default:
                switch (m153322n) {
                    case 0:
                        if (c31902e9.m153321m() != null && c31902e9.m153321m().m132429g() == -100) {
                            return 10;
                        }
                        return 1;
                    case 1:
                        return 2;
                    case 2:
                        return 3;
                    case 3:
                        return 4;
                    case 4:
                        return 5;
                    case 5:
                        return 6;
                    case 6:
                        return 9;
                    case 7:
                        return 11;
                    case 8:
                        return 12;
                    case 9:
                        return 13;
                    case 10:
                        return 14;
                    case 11:
                        return 15;
                    default:
                        return 0;
                }
        }
    }

    /* renamed from: u0 */
    public void m65703u0(boolean z11) {
        this.f61482B = z11;
    }

    /* renamed from: v0 */
    public void m65704v0(boolean z11) {
        this.f61486u = z11;
    }

    /* renamed from: w0 */
    public void m65705w0(List list) {
        if (list == null) {
            this.f61483r = new ArrayList();
        } else {
            this.f61483r = new ArrayList(list);
        }
        this.f61487v = -1;
        this.f61488w = m65685c0();
        m10008p();
    }

    /* renamed from: x0 */
    public void m65706x0(AbstractC19215a abstractC19215a) {
        this.f61491z = abstractC19215a;
    }
}
