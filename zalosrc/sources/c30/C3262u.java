package c30;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.StickerManageView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import me0.AbstractC23152n3;
import me0.C23212s8;
import me0.C23278z2;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p588vw.C28644j;
import zc0.AbstractC31783a;
import zc0.InterfaceC31785c;
import zc0.InterfaceC31786d;

/* renamed from: c30.u */
/* loaded from: classes5.dex */
public class C3262u extends AbstractC31783a {

    /* renamed from: A */
    public InterfaceC27218a f13970A;

    /* renamed from: B */
    public Context f13971B;

    /* renamed from: C */
    public LayoutInflater f13972C;

    /* renamed from: D */
    private final C23528a f13973D;

    /* renamed from: G */
    private int f13976G;

    /* renamed from: r */
    ArrayList f13979r;

    /* renamed from: u */
    private final String f13982u;

    /* renamed from: v */
    private final String f13983v;

    /* renamed from: w */
    private final int f13984w;

    /* renamed from: x */
    private final int f13985x;

    /* renamed from: y */
    InterfaceC31786d f13986y;

    /* renamed from: z */
    StickerManageView.InterfaceC15093d f13987z;

    /* renamed from: s */
    boolean f13980s = false;

    /* renamed from: t */
    private boolean f13981t = false;

    /* renamed from: E */
    public int f13974E = -1;

    /* renamed from: F */
    a f13975F = null;

    /* renamed from: H */
    boolean f13977H = false;

    /* renamed from: I */
    boolean f13978I = false;

    /* renamed from: c30.u$a */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.AbstractC1876c0 implements InterfaceC31785c {

        /* renamed from: I */
        public LinearLayout f13988I;

        /* renamed from: J */
        public RecyclingImageView f13989J;

        /* renamed from: K */
        public ImageView f13990K;

        /* renamed from: L */
        public View f13991L;

        /* renamed from: M */
        public RobotoButton f13992M;

        /* renamed from: N */
        public RobotoTextView f13993N;

        /* renamed from: O */
        public TextView f13994O;

        /* renamed from: P */
        public TextView f13995P;

        /* renamed from: Q */
        public View f13996Q;

        public a(View view) {
            super(view);
            this.f13988I = (LinearLayout) view.findViewById(AbstractC6918a0.layoutStickerCategory);
            this.f13990K = (ImageView) view.findViewById(AbstractC6918a0.drag_handle);
            this.f13991L = view.findViewById(AbstractC6918a0.delete_sticker);
            this.f13989J = (RecyclingImageView) view.findViewById(AbstractC6918a0.buddy_dp);
            this.f13992M = (RobotoButton) view.findViewById(AbstractC6918a0.imvDownload);
            RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
            this.f13993N = robotoTextView;
            robotoTextView.setTextStyleBold(true);
            this.f13994O = (TextView) view.findViewById(AbstractC6918a0.quantity);
            this.f13995P = (TextView) view.findViewById(AbstractC6918a0.status);
            this.f13996Q = view.findViewById(AbstractC6918a0.separate_line);
        }

        @Override // zc0.InterfaceC31785c
        /* renamed from: h */
        public void mo16604h() {
            this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
        }

        /* renamed from: i0 */
        public void m16605i0() {
            this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg_pressed);
        }

        @Override // zc0.InterfaceC31785c
        /* renamed from: m */
        public void mo16606m() {
            View view = this.f7784p;
            view.setBackground(C23212s8.m119609q(view.getContext(), AbstractC16781w.bg_sticker_arrange_dragging));
        }
    }

    public C3262u(InterfaceC27218a interfaceC27218a, C23528a c23528a, InterfaceC31786d interfaceC31786d, StickerManageView.InterfaceC15093d interfaceC15093d, int i11) {
        this.f13970A = interfaceC27218a;
        Context context = interfaceC27218a.getContext();
        this.f13971B = context;
        this.f13973D = c23528a;
        this.f13972C = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f13982u = this.f13971B.getString(AbstractC8020f0.str_sticker_hot).toUpperCase();
        this.f13983v = this.f13971B.getString(AbstractC8020f0.str_sticker_new).toUpperCase();
        this.f13985x = C23212s8.m119607o(this.f13971B, AbstractC7354t0.NotificationColor1);
        this.f13984w = C23212s8.m119607o(this.f13971B, AbstractC16781w.AppPrimaryColor);
        this.f13986y = interfaceC31786d;
        this.f13987z = interfaceC15093d;
        this.f13976G = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ boolean m16590V(a aVar, View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            m16597S();
            m16600Z();
            this.f13978I = false;
            InterfaceC31786d interfaceC31786d = this.f13986y;
            if (interfaceC31786d != null) {
                interfaceC31786d.mo79463c(aVar);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ boolean m16591W(a aVar, View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 2 && this.f13978I && this.f13977H) {
            this.f13978I = false;
            InterfaceC31786d interfaceC31786d = this.f13986y;
            if (interfaceC31786d != null) {
                interfaceC31786d.mo79463c(aVar);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m16592X(C3245i c3245i, View view) {
        AbstractC23647d.m123906p("9197");
        StickerManageView.InterfaceC15093d interfaceC15093d = this.f13987z;
        if (interfaceC15093d != null) {
            interfaceC15093d.mo84510a(c3245i);
        }
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m16593Y(C3245i c3245i, View view) {
        int i11;
        try {
            AbstractC23647d.m123906p("1350");
            if (this.f13980s) {
                i11 = 255;
            } else {
                i11 = 256;
            }
            AbstractC23152n3.m119072u0(this.f13970A, c3245i.f13854b, "1350", IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO, "", i11, "", this.f13976G);
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        int i12;
        final C3245i c3245i;
        int i13;
        int i14;
        int i15;
        if (abstractC1876c0 == null) {
            return;
        }
        final a aVar = (a) abstractC1876c0;
        int i16 = 8;
        aVar.f13990K.setVisibility(8);
        aVar.f13991L.setVisibility(8);
        aVar.f13992M.setFocusable(false);
        aVar.f13992M.setFocusableInTouchMode(false);
        aVar.f13992M.setVisibility(8);
        aVar.f13994O.setText("");
        if (this.f13980s) {
            aVar.f13990K.setOnTouchListener(new View.OnTouchListener() { // from class: c30.q
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m16590V;
                    m16590V = C3262u.this.m16590V(aVar, view, motionEvent);
                    return m16590V;
                }
            });
            if (mo10003k() > 1) {
                aVar.f13988I.setOnTouchListener(new View.OnTouchListener() { // from class: c30.r
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m16591W;
                        m16591W = C3262u.this.m16591W(aVar, view, motionEvent);
                        return m16591W;
                    }
                });
            }
        }
        if (this.f13980s) {
            ImageView imageView = aVar.f13990K;
            if (mo10003k() == 1) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            imageView.setVisibility(i15);
        } else {
            aVar.f13992M.setVisibility(0);
        }
        View view = aVar.f13996Q;
        if (mo10003k() == 1) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        view.setVisibility(i12);
        aVar.f13989J.setImageResource(AbstractC16803z.ic_onion);
        ArrayList arrayList = this.f13979r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size() && (c3245i = (C3245i) this.f13979r.get(i11)) != null) {
            int i17 = c3245i.f13854b;
            if (i17 != 0 && i17 != -2 && i17 != 39 && i17 != -10) {
                aVar.f13991L.setVisibility(0);
                aVar.f13991L.setOnClickListener(new View.OnClickListener() { // from class: c30.s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C3262u.this.m16592X(c3245i, view2);
                    }
                });
            }
            aVar.f13993N.setVisibility(8);
            if (!TextUtils.isEmpty(c3245i.m16464f())) {
                aVar.f13993N.setVisibility(0);
                aVar.f13993N.setText(c3245i.m16464f());
            }
            aVar.f13995P.setVisibility(8);
            aVar.f13995P.setTextColor(this.f13984w);
            int i18 = c3245i.f13870r;
            if (i18 == 1) {
                aVar.f13995P.setText(this.f13983v);
                aVar.f13995P.setVisibility(0);
            } else if (i18 == 2) {
                aVar.f13995P.setText(this.f13982u);
                aVar.f13995P.setTextColor(this.f13985x);
                aVar.f13995P.setVisibility(0);
            }
            if (c3245i.m16463e() != 0) {
                if (!TextUtils.isEmpty(c3245i.f13859g)) {
                    ((C23528a) this.f13973D.m123612r(aVar.f13989J)).m123618x(c3245i.f13859g, C23278z2.m120089P0());
                }
                TextView textView = aVar.f13994O;
                Context context = this.f13971B;
                int i19 = AbstractC8020f0.str_StickerDetails_quantity;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(c3245i.f13868p);
                Context context2 = this.f13971B;
                if (c3245i.f13868p > 1) {
                    i14 = AbstractC8020f0.str_more_s;
                } else {
                    i14 = AbstractC8020f0.str_single_form;
                }
                objArr[1] = context2.getString(i14);
                textView.setText(context.getString(i19, objArr));
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: c30.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C3262u.this.m16593Y(c3245i, view2);
                    }
                };
                aVar.f13992M.setText(this.f13971B.getString(AbstractC8020f0.str_stickercategory_free));
                if (!this.f13981t && C28644j.m143233Y().m143312x0(c3245i.f13854b)) {
                    SparseIntArray sparseIntArray = AbstractC23304d.f113386g0;
                    if (sparseIntArray != null && sparseIntArray.get(c3245i.f13854b) > 0 && AbstractC23304d.f113386g0.get(c3245i.f13854b) < c3245i.f13871s) {
                        aVar.f13992M.setEnabled(true);
                        aVar.f13992M.setText(this.f13971B.getString(AbstractC8020f0.update).toUpperCase());
                        aVar.f13992M.setOnClickListener(onClickListener);
                    } else {
                        aVar.f13992M.setEnabled(false);
                        aVar.f13992M.setText(this.f13971B.getString(AbstractC8020f0.str_stickercategory_exist).toUpperCase());
                        aVar.f13992M.setOnClickListener(null);
                    }
                    RobotoButton robotoButton = aVar.f13992M;
                    if (!this.f13981t) {
                        i16 = 0;
                    }
                    robotoButton.setVisibility(i16);
                } else {
                    aVar.f13992M.setEnabled(true);
                    aVar.f13992M.setText(this.f13971B.getString(AbstractC8020f0.str_stickercategory_free).toUpperCase());
                    RobotoButton robotoButton2 = aVar.f13992M;
                    if (!this.f13981t) {
                        i16 = 0;
                    }
                    robotoButton2.setVisibility(i16);
                    aVar.f13992M.setOnClickListener(onClickListener);
                }
            } else {
                ((C23528a) this.f13973D.m123612r(aVar.f13989J)).m123613s(AbstractC16803z.ic_onion_avatar);
                int m143296a0 = C28644j.m143233Y().m143296a0(0, false);
                TextView textView2 = aVar.f13994O;
                Context context3 = this.f13971B;
                int i21 = AbstractC8020f0.str_StickerDetails_quantity;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(m143296a0);
                Context context4 = this.f13971B;
                if (m143296a0 > 1) {
                    i13 = AbstractC8020f0.str_more_s;
                } else {
                    i13 = AbstractC8020f0.str_single_form;
                }
                objArr2[1] = context4.getString(i13);
                textView2.setText(context3.getString(i21, objArr2));
            }
            if (this.f13974E == c3245i.f13854b) {
                aVar.m16605i0();
                this.f13974E = -1;
                this.f13975F = aVar;
                return;
            }
            aVar.mo16604h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new a(this.f13972C.inflate(AbstractC7409c0.stickercategory_row, viewGroup, false));
    }

    @Override // zc0.AbstractC31783a
    /* renamed from: L */
    public boolean mo16594L(int i11, int i12) {
        if (this.f13977H) {
            Collections.swap(this.f13979r, i11, i12);
            m10012t(i11, i12);
            return true;
        }
        return true;
    }

    @Override // zc0.AbstractC31783a
    /* renamed from: M */
    public boolean mo16595M(int i11, int i12) {
        InterfaceC31786d interfaceC31786d;
        if (this.f13977H && (interfaceC31786d = this.f13986y) != null) {
            interfaceC31786d.mo79462b(i11, i12);
            return false;
        }
        return false;
    }

    @Override // zc0.AbstractC31783a
    /* renamed from: N */
    public void mo16596N() {
        if (this.f13977H) {
            this.f13977H = false;
            AbstractC23647d.m123906p("9199");
            InterfaceC31786d interfaceC31786d = this.f13986y;
            if (interfaceC31786d != null) {
                interfaceC31786d.mo79461a();
            }
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: S */
    public void m16597S() {
        this.f13977H = true;
        this.f13978I = true;
    }

    /* renamed from: T */
    public int m16598T(int i11) {
        if (this.f13979r == null) {
            return -1;
        }
        for (int i12 = 0; i12 < this.f13979r.size(); i12++) {
            if (((C3245i) this.f13979r.get(i12)).f13854b == i11) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: U */
    public ArrayList m16599U() {
        return this.f13979r;
    }

    /* renamed from: Z */
    public void m16600Z() {
        a aVar = this.f13975F;
        if (aVar != null) {
            aVar.mo16604h();
            this.f13975F = null;
        }
    }

    /* renamed from: a0 */
    public void m16601a0(boolean z11) {
        this.f13981t = z11;
    }

    /* renamed from: b0 */
    public void m16602b0(boolean z11) {
        this.f13980s = z11;
    }

    /* renamed from: c0 */
    public void m16603c0(ArrayList arrayList) {
        this.f13979r = new ArrayList(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f13979r;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
