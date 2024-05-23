package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import c30.C3255n;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.QuickCreateGroupAdapter;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.bubbleview.ActionEditText;
import com.zing.zalo.bubbleview.IconBubbleEditText;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactMask;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ComposeNewChatView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import gw.AbstractC19646n0;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20789d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p588vw.C28644j;
import p588vw.C28652r;
import p716zh.C31952i;
import p716zh.C31973j5;
import p716zh.C32035n7;
import p716zh.C32039nb;
import p716zh.C32076q5;
import p716zh.C32141v0;
import p720zl.C32223a;
import sx.C26404f;
import v50.C27870vb;
import vg.C28020b3;
import vg.C28146o3;
import vg.C28157p5;
import vg.C28203u6;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class ComposeNewChatView extends SlidableZaloView implements InterfaceC17463d.d, View.OnClickListener, View.OnTouchListener, C23744a.c, InterfaceC0733x {

    /* renamed from: i2 */
    static final String f72842i2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alphabe);

    /* renamed from: P0 */
    KeyboardFrameLayout f72858P0;

    /* renamed from: Q0 */
    View f72860Q0;

    /* renamed from: R0 */
    MultiStateView f72862R0;

    /* renamed from: S0 */
    RecyclerView f72864S0;

    /* renamed from: S1 */
    long f72865S1;

    /* renamed from: T0 */
    RecyclerView f72866T0;

    /* renamed from: T1 */
    HandlerThread f72867T1;

    /* renamed from: U0 */
    IconBubbleEditText f72868U0;

    /* renamed from: U1 */
    Handler f72869U1;

    /* renamed from: V0 */
    EditText f72870V0;

    /* renamed from: W0 */
    AppCompatImageView f72872W0;

    /* renamed from: X0 */
    View f72874X0;

    /* renamed from: Y0 */
    RobotoTextView f72876Y0;

    /* renamed from: Z0 */
    ImageView f72878Z0;

    /* renamed from: a1 */
    ViewStub f72880a1;

    /* renamed from: b1 */
    View f72882b1;

    /* renamed from: c1 */
    EditText f72884c1;

    /* renamed from: d1 */
    ImageView f72886d1;

    /* renamed from: e1 */
    View f72888e1;

    /* renamed from: f1 */
    ViewStub f72890f1;

    /* renamed from: g1 */
    View f72892g1;

    /* renamed from: h1 */
    AppCompatImageView f72894h1;

    /* renamed from: i1 */
    EditText f72896i1;

    /* renamed from: j1 */
    View f72897j1;

    /* renamed from: k1 */
    ViewStub f72898k1;

    /* renamed from: l1 */
    View f72899l1;

    /* renamed from: m1 */
    StickerPanelView f72900m1;

    /* renamed from: n1 */
    QuickCreateGroupAdapter f72901n1;

    /* renamed from: o1 */
    QuickCreateGroupAdapter f72902o1;

    /* renamed from: v1 */
    boolean f72909v1;

    /* renamed from: w1 */
    String f72910w1;

    /* renamed from: x1 */
    C26404f f72911x1;

    /* renamed from: y1 */
    PreviewStickerDialogView f72912y1;

    /* renamed from: p1 */
    String f72903p1 = "";

    /* renamed from: q1 */
    String f72904q1 = "";

    /* renamed from: r1 */
    String f72905r1 = "";

    /* renamed from: s1 */
    short f72906s1 = 5;

    /* renamed from: t1 */
    int f72907t1 = 0;

    /* renamed from: u1 */
    int f72908u1 = 0;

    /* renamed from: z1 */
    C28146o3 f72913z1 = null;

    /* renamed from: A1 */
    boolean f72843A1 = true;

    /* renamed from: B1 */
    TextWatcher f72844B1 = new C14173a();

    /* renamed from: C1 */
    volatile HashMap f72845C1 = new HashMap();

    /* renamed from: D1 */
    volatile C32223a f72846D1 = new C32223a();

    /* renamed from: E1 */
    volatile C32223a f72847E1 = new C32223a();

    /* renamed from: F1 */
    volatile C32223a f72848F1 = new C32223a();

    /* renamed from: G1 */
    volatile C32223a f72849G1 = new C32223a();

    /* renamed from: H1 */
    volatile C32223a f72850H1 = new C32223a();

    /* renamed from: I1 */
    volatile C32223a f72851I1 = new C32223a();

    /* renamed from: J1 */
    volatile C32223a f72852J1 = new C32223a();

    /* renamed from: K1 */
    volatile C32223a f72853K1 = new C32223a();

    /* renamed from: L1 */
    volatile C32223a f72854L1 = new C32223a();

    /* renamed from: M1 */
    final HashSet f72855M1 = new HashSet();

    /* renamed from: N1 */
    boolean f72856N1 = true;

    /* renamed from: O1 */
    boolean f72857O1 = true;

    /* renamed from: P1 */
    String f72859P1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggested);

    /* renamed from: Q1 */
    String f72861Q1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_recently_contacted);

    /* renamed from: R1 */
    String f72863R1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_recently_add_friend);

    /* renamed from: V1 */
    boolean f72871V1 = false;

    /* renamed from: W1 */
    final Runnable f72873W1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.g8
        @Override // java.lang.Runnable
        public final void run() {
            ComposeNewChatView.this.m79030eN();
        }
    };

    /* renamed from: X1 */
    int f72875X1 = 1;

    /* renamed from: Y1 */
    int f72877Y1 = 3;

    /* renamed from: Z1 */
    int f72879Z1 = 0;

    /* renamed from: a2 */
    Runnable f72881a2 = new RunnableC14181i();

    /* renamed from: b2 */
    boolean f72883b2 = false;

    /* renamed from: c2 */
    int f72885c2 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;

    /* renamed from: d2 */
    int f72887d2 = 0;

    /* renamed from: e2 */
    ArrayList f72889e2 = new ArrayList();

    /* renamed from: f2 */
    final Runnable f72891f2 = new RunnableC14174b();

    /* renamed from: g2 */
    int f72893g2 = 0;

    /* renamed from: h2 */
    final Runnable f72895h2 = new Runnable() { // from class: com.zing.zalo.ui.zviews.h8
        @Override // java.lang.Runnable
        public final void run() {
            ComposeNewChatView.this.m78982OM();
        }
    };

    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$a */
    /* loaded from: classes6.dex */
    class C14173a extends AbstractC18391a {

        /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$a$a */
        /* loaded from: classes6.dex */
        class a implements C28146o3.b {
            a() {
            }

            @Override // vg.C28146o3.b
            /* renamed from: a */
            public void mo40211a() {
                try {
                    ComposeNewChatView.this.m79042rN();
                    ComposeNewChatView composeNewChatView = ComposeNewChatView.this;
                    if (composeNewChatView.f72875X1 == 2 && TextUtils.isEmpty(composeNewChatView.f72870V0.getText().toString().trim())) {
                        ComposeNewChatView.this.m79039nN(1);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // vg.C28146o3.b
            /* renamed from: b */
            public void mo40212b(boolean z11, String str, ArrayList arrayList, int i11) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (str.equals(ComposeNewChatView.this.f72870V0.getText().toString().trim())) {
                        ComposeNewChatView.this.m79039nN(2);
                        ComposeNewChatView.this.f72866T0.m9837K1(0);
                        C32223a c32223a = new C32223a();
                        c32223a.m155388b(arrayList);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it = c32223a.m155392f().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                            if (AbstractC21935u.m114556w(inviteContactProfile.f42434r)) {
                                arrayList2.add(inviteContactProfile);
                            } else {
                                arrayList3.add(inviteContactProfile);
                            }
                            if (TextUtils.isEmpty(inviteContactProfile.f42436r1) && TextUtils.isEmpty(inviteContactProfile.f42439s1)) {
                                if (ComposeNewChatView.this.f72850H1.m155391e(inviteContactProfile)) {
                                    arrayList4.add(new C32141v0(0, inviteContactProfile));
                                } else {
                                    arrayList4.add(new C32141v0(0, inviteContactProfile, 3));
                                }
                                i12++;
                            }
                            arrayList4.add(new C32141v0(0, inviteContactProfile, 4));
                            i12++;
                        }
                        arrayList4.add(new C32141v0(2, null));
                        if (i12 == 1) {
                            if (arrayList3.size() == 1) {
                                ComposeNewChatView.this.f72902o1.f38240A = true;
                            } else {
                                QuickCreateGroupAdapter quickCreateGroupAdapter = ComposeNewChatView.this.f72902o1;
                                quickCreateGroupAdapter.f38240A = false;
                                quickCreateGroupAdapter.f38241B = false;
                            }
                        } else {
                            QuickCreateGroupAdapter quickCreateGroupAdapter2 = ComposeNewChatView.this.f72902o1;
                            quickCreateGroupAdapter2.f38240A = false;
                            quickCreateGroupAdapter2.f38241B = false;
                        }
                        ComposeNewChatView.this.f72902o1.m35818Q(arrayList4);
                        ComposeNewChatView.this.f72902o1.m35819R(i12);
                        ComposeNewChatView.this.f72902o1.m10008p();
                    }
                    ComposeNewChatView.this.f72868U0.m37550u(null);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        C14173a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ComposeNewChatView.this.f72870V0.setCursorVisible(true);
            ComposeNewChatView.this.m79042rN();
            String trim = charSequence.toString().trim();
            try {
                C28146o3 c28146o3 = ComposeNewChatView.this.f72913z1;
                if (c28146o3 != null) {
                    c28146o3.m141659d();
                }
                a aVar = new a();
                ComposeNewChatView.this.f72913z1 = new C28146o3(trim, AbstractC23184q2.m119445c(), ComposeNewChatView.this.f72852J1.m155392f(), null, aVar);
                ComposeNewChatView.this.f72913z1.start();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$b */
    /* loaded from: classes6.dex */
    class RunnableC14174b implements Runnable {
        RunnableC14174b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                EditText editText = ComposeNewChatView.this.f72896i1;
                if (editText != null && editText.getText().length() > 0) {
                    ComposeNewChatView.this.m79035kN();
                    ComposeNewChatView composeNewChatView = ComposeNewChatView.this;
                    composeNewChatView.mo78955kl(composeNewChatView.f72891f2, 400L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$c */
    /* loaded from: classes6.dex */
    public class C14175c extends AbstractC31727b {
        C14175c() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: c */
        public void mo46563c(String str) {
            C25630b m143290W;
            try {
                if (!TextUtils.isEmpty(str) && (m143290W = C28644j.m143233Y().m143290W(str)) != null && !m143290W.m132399G()) {
                    AbstractC20789d.m108472f(301, ComposeNewChatView.this.f72421L0.m92649TI());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            char charAt;
            try {
                EditText editText = ComposeNewChatView.this.f72896i1;
                if (editText != null) {
                    editText.requestFocus();
                }
                if (ComposeNewChatView.this.f72896i1 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int selectionEnd = ComposeNewChatView.this.f72896i1.getSelectionEnd();
                    if (selectionEnd == ComposeNewChatView.this.f72896i1.getText().length() && AbstractC23309i.m121379Rd() == 1) {
                        if (selectionEnd > 0 && (charAt = ComposeNewChatView.this.f72896i1.getText().toString().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                            sb2.append(" ");
                            sb2.append(str);
                        }
                        if (selectionEnd == ComposeNewChatView.this.f72896i1.getText().length()) {
                            if (sb2.length() == 0) {
                                sb2.append(str);
                                sb2.append(" ");
                            } else {
                                sb2.append(" ");
                            }
                        }
                    }
                    if (sb2.length() > 0 && sb2.toString().trim().equals(str)) {
                        str = sb2.toString();
                    }
                    if ((3000 - ComposeNewChatView.this.f72896i1.length()) - str.length() >= 0) {
                        ComposeNewChatView.this.f72896i1.getText().insert(selectionEnd, str);
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 3000));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                ComposeNewChatView.this.m79037le(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: o */
        public void mo38307o(C25630b c25630b, int i11, int i12, int i13) {
            try {
                ComposeNewChatView.this.m79029Ka(0);
                if (i11 != -2) {
                    C3255n.m16562n().m16578v(c25630b);
                }
                ComposeNewChatView.this.f72911x1 = new C26404f(8);
                ComposeNewChatView composeNewChatView = ComposeNewChatView.this;
                composeNewChatView.f72911x1.f125464t = c25630b;
                composeNewChatView.m79023FM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: p */
        public void mo46564p(C25630b c25630b, int i11, int i12, int i13) {
            try {
                if (c25630b.m132427f() >= 0) {
                    C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
                    try {
                        ComposeNewChatView composeNewChatView = ComposeNewChatView.this;
                        AbstractC20789d.m108483q(composeNewChatView.f72912y1, composeNewChatView.f72421L0.m92676n2());
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("gifInfo", m143290W);
                        bundle.putInt("source", i11);
                        ComposeNewChatView composeNewChatView2 = ComposeNewChatView.this;
                        BaseZaloView baseZaloView = composeNewChatView2.f72421L0;
                        composeNewChatView2.f72912y1 = AbstractC20789d.m108482p(301, baseZaloView, baseZaloView.m92649TI(), bundle);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$d */
    /* loaded from: classes6.dex */
    public class C14176d implements KeyboardFrameLayout.InterfaceC13508a {
        C14176d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m79046b() {
            ComposeNewChatView composeNewChatView = ComposeNewChatView.this;
            if (composeNewChatView.f72893g2 != 2) {
                composeNewChatView.m79029Ka(0);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                ComposeNewChatView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComposeNewChatView.C14176d.this.m79046b();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            try {
                ComposeNewChatView composeNewChatView = ComposeNewChatView.this;
                if (composeNewChatView.f72893g2 != 1) {
                    composeNewChatView.m79029Ka(1);
                }
                EditText editText = ComposeNewChatView.this.f72896i1;
                if (editText != null) {
                    editText.setSelection(editText.getText().toString().length());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$e */
    /* loaded from: classes6.dex */
    public class C14177e extends RecyclerView.AbstractC1892s {
        C14177e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 1) {
                AbstractC2379w.m12430d(ComposeNewChatView.this.f72870V0);
                ComposeNewChatView.this.f72870V0.setCursorVisible(false);
                ComposeNewChatView.this.f72870V0.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$f */
    /* loaded from: classes6.dex */
    public class C14178f extends RecyclerView.AbstractC1892s {
        C14178f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 1) {
                ComposeNewChatView.this.f72870V0.setCursorVisible(false);
                ComposeNewChatView.this.f72870V0.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$g */
    /* loaded from: classes6.dex */
    public class C14179g extends AbstractC18391a {
        C14179g() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().trim().length() > 0) {
                C28652r.m143349v().m143361W(editable);
            }
            ComposeNewChatView.this.f72868U0.m37550u(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$h */
    /* loaded from: classes6.dex */
    public class C14180h extends AbstractC18391a {
        C14180h() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 50) {
                ComposeNewChatView.this.f72884c1.setText(editable.toString().substring(0, 50));
                EditText editText = ComposeNewChatView.this.f72884c1;
                editText.setSelection(editText.getText().toString().length());
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 50));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$i */
    /* loaded from: classes6.dex */
    class RunnableC14181i implements Runnable {
        RunnableC14181i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComposeNewChatView composeNewChatView = ComposeNewChatView.this;
                int i11 = composeNewChatView.f72879Z1;
                if (i11 != 0) {
                    if (i11 == 1) {
                        composeNewChatView.f72876Y0.setText(composeNewChatView.f72904q1);
                        if (TextUtils.isEmpty(ComposeNewChatView.this.f72904q1)) {
                            ComposeNewChatView.this.f72876Y0.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_group_name_hint));
                        } else {
                            ComposeNewChatView.this.f72876Y0.setHint("");
                        }
                        ComposeNewChatView.this.f72878Z0.setVisibility(0);
                        return;
                    }
                    return;
                }
                composeNewChatView.f72876Y0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_chat_title_bar));
                ComposeNewChatView.this.f72878Z0.setVisibility(8);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$j */
    /* loaded from: classes6.dex */
    public class C14182j extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f72924a;

        C14182j(ContactProfile contactProfile) {
            this.f72924a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42221O7(this.f72924a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ComposeNewChatView$k */
    /* loaded from: classes6.dex */
    public class C14183k implements InterfaceC20094a {
        C14183k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m79048d(ContactProfile contactProfile, C31973j5 c31973j5) {
            try {
                Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                m140776b.putString("groupId", c31973j5.m153781r());
                m140776b.putString("groupName", contactProfile.f42437s);
                m140776b.putInt("SHOW_WITH_FLAGS", 7340032);
                if (ComposeNewChatView.this.f72421L0.m92676n2() != null) {
                    ComposeNewChatView.this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                }
                if (ComposeNewChatView.this.f72911x1 != null) {
                    AbstractC23112j7.m118513W(contactProfile.mo2478b(), ComposeNewChatView.this.f72911x1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() != 17015) {
                AbstractC23161o1.m119321f(c20096c, false);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                    if (jSONObject.has("maxUsers")) {
                        ComposeNewChatView.this.f72885c2 = jSONObject.optInt("maxUsers");
                    }
                } catch (Exception e11) {
                    ComposeNewChatView.this.f72885c2 = C19637j.f97466a.m102831L();
                    e11.printStackTrace();
                }
                AbstractC2364o0.m12373p(ComposeNewChatView.this.f72421L0, 1);
            }
            ComposeNewChatView.this.f72421L0.mo49315c4();
            ComposeNewChatView.this.f72883b2 = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x028f A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x029e A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02b1 A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02c7 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x021b A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x024a A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0253 A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0169 A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0174 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01d1 A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01e6 A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0269 A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:3:0x000d, B:6:0x0023, B:8:0x0029, B:10:0x0035, B:12:0x003f, B:13:0x004c, B:15:0x0052, B:17:0x005d, B:21:0x0062, B:23:0x00aa, B:24:0x00b1, B:26:0x00b8, B:31:0x00cc, B:33:0x00d3, B:35:0x00da, B:37:0x00e5, B:38:0x00f2, B:40:0x00f8, B:42:0x0100, B:44:0x0129, B:45:0x013c, B:47:0x0142, B:48:0x014b, B:50:0x0151, B:52:0x015f, B:54:0x0169, B:56:0x0174, B:64:0x01cb, B:66:0x01d1, B:67:0x01e0, B:69:0x01e6, B:70:0x01f3, B:72:0x01f9, B:76:0x0256, B:77:0x0263, B:79:0x0269, B:82:0x0271, B:85:0x0279, B:88:0x0281, B:91:0x0289, B:100:0x028f, B:102:0x0295, B:103:0x0298, B:105:0x029e, B:106:0x02ab, B:108:0x02b1, B:109:0x02b4, B:111:0x02c7, B:112:0x0203, B:113:0x0215, B:115:0x021b, B:117:0x0223, B:119:0x022d, B:122:0x0231, B:124:0x0239, B:130:0x0242, B:132:0x024a, B:133:0x024d, B:135:0x0253, B:138:0x01c8), top: B:2:0x000d }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            int i11;
            String str;
            C31973j5 c31973j5;
            boolean z11;
            int i12;
            final C31973j5 c31973j52;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Iterator it;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            Iterator it2;
            ComposeNewChatView.this.f72909v1 = false;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject.has("data") && jSONObject.has("error_code")) {
                    if (!jSONObject.getString("data").equals("null") && !jSONObject.getString("data").equals("")) {
                        jSONObject2 = new JSONObject(jSONObject.getString("data"));
                    }
                    if (!jSONObject.isNull("error_code")) {
                        i11 = jSONObject.getInt("error_code");
                    } else {
                        i11 = -999;
                    }
                } else {
                    i11 = 0;
                }
                if (i11 != 0) {
                    ToastUtils.m89260h(i11, false);
                } else {
                    String optString = jSONObject2.optString("id");
                    String optString2 = jSONObject2.optString("name");
                    String optString3 = jSONObject2.optString("desc");
                    String optString4 = jSONObject2.optString("members");
                    String optString5 = jSONObject2.optString("avt");
                    int optInt = jSONObject2.optInt("totalMembers");
                    int optInt2 = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    int optInt3 = jSONObject2.optInt("subType");
                    String optString6 = jSONObject2.optString("msgInfo");
                    String optString7 = jSONObject2.optString("setting");
                    String optString8 = jSONObject2.optString("extraInfo");
                    if (jSONObject2.isNull("owner_id")) {
                        str = "";
                    } else {
                        str = jSONObject2.getString("owner_id");
                    }
                    if (!TextUtils.isEmpty(optString)) {
                        c31973j5 = C0943w.m4462l().m4472f(optString);
                    } else {
                        c31973j5 = null;
                    }
                    if (c31973j5 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && ComposeNewChatView.this.f72906s1 == 5) {
                        AbstractC23647d.m123897g("27431");
                    }
                    if (c31973j5 == null) {
                        ArrayList arrayList10 = new ArrayList();
                        if (!TextUtils.isEmpty(optString4)) {
                            arrayList10.addAll(Arrays.asList(optString4.split(";")));
                        }
                        if (!TextUtils.isEmpty(optString) && !optString.equals("0")) {
                            i12 = 1;
                            c31973j5 = new C31973j5(optString, optString2, optString3, str, "", optString5, arrayList10, optInt, optString7, optInt2, optInt3, optString8, "");
                            C32076q5 c32076q5 = new C32076q5(optString);
                            c32076q5.m154715d(c31973j5, arrayList10, new ArrayList());
                            if (C7960e.m41971c6() != null) {
                                ComposeNewChatView.this.f72909v1 = TextUtils.isEmpty(c31973j5.m153773n());
                                C0943w.m4462l().m4477n(c31973j5, c32076q5);
                            }
                            if (AbstractC23309i.m120739A2()) {
                                AbstractC19646n0.m102971e1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_new_create_group), null, c31973j5, true);
                            }
                            if (ComposeNewChatView.this.f72909v1) {
                                C19637j.f97466a.m102856l(c31973j5.m153781r(), false);
                            }
                            c31973j52 = c31973j5;
                            if (!TextUtils.isEmpty(ComposeNewChatView.this.f72910w1)) {
                                C19637j.f97466a.m102842a0(ComposeNewChatView.this.f72910w1);
                            }
                            if (c31973j52 != null) {
                                AbstractC23184q2.m119438C(optString);
                                ArrayList arrayList11 = new ArrayList();
                                ArrayList arrayList12 = new ArrayList();
                                ArrayList arrayList13 = new ArrayList();
                                ArrayList arrayList14 = new ArrayList();
                                ArrayList arrayList15 = new ArrayList();
                                ArrayList arrayList16 = new ArrayList();
                                try {
                                    String optString9 = jSONObject2.optString("wrong_members", "");
                                    if (!TextUtils.isEmpty(optString9)) {
                                        JSONArray jSONArray = new JSONArray(optString9);
                                        arrayList = arrayList16;
                                        arrayList2 = arrayList14;
                                        arrayList3 = arrayList13;
                                        arrayList4 = arrayList12;
                                        try {
                                            AbstractC23184q2.m119468z(jSONArray, arrayList11, arrayList12, arrayList13, arrayList2, arrayList15, arrayList);
                                        } catch (Exception e11) {
                                            e = e11;
                                            e.printStackTrace();
                                            if (arrayList4.size() > 0) {
                                            }
                                            if (arrayList11.size() > 0) {
                                            }
                                            if (arrayList3.size() <= 0) {
                                                arrayList7 = arrayList3;
                                                arrayList9 = new ArrayList();
                                                it2 = ComposeNewChatView.this.f72889e2.iterator();
                                                while (it2.hasNext()) {
                                                }
                                                if (!z11) {
                                                }
                                                if (arrayList.size() > 0) {
                                                }
                                                if (!TextUtils.isEmpty(optString6)) {
                                                }
                                                final ContactProfile contactProfile = new ContactProfile(i12, optString);
                                                contactProfile.f42437s = optString2;
                                                contactProfile.f42446v = optString5;
                                                if (ComposeNewChatView.this.f72421L0.m92676n2() != null) {
                                                }
                                                ComposeNewChatView.this.f72421L0.mo49315c4();
                                            }
                                            arrayList5 = new ArrayList();
                                            arrayList6 = new ArrayList();
                                            it = ComposeNewChatView.this.f72889e2.iterator();
                                            while (it.hasNext()) {
                                            }
                                            arrayList7 = arrayList3;
                                            if (!arrayList5.isEmpty()) {
                                            }
                                            if (!arrayList6.isEmpty()) {
                                            }
                                            arrayList9 = new ArrayList();
                                            it2 = ComposeNewChatView.this.f72889e2.iterator();
                                            while (it2.hasNext()) {
                                            }
                                            if (!z11) {
                                            }
                                            if (arrayList.size() > 0) {
                                            }
                                            if (!TextUtils.isEmpty(optString6)) {
                                            }
                                            final ContactProfile contactProfile2 = new ContactProfile(i12, optString);
                                            contactProfile2.f42437s = optString2;
                                            contactProfile2.f42446v = optString5;
                                            if (ComposeNewChatView.this.f72421L0.m92676n2() != null) {
                                            }
                                            ComposeNewChatView.this.f72421L0.mo49315c4();
                                        }
                                    } else {
                                        arrayList = arrayList16;
                                        arrayList2 = arrayList14;
                                        arrayList3 = arrayList13;
                                        arrayList4 = arrayList12;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    arrayList = arrayList16;
                                    arrayList2 = arrayList14;
                                    arrayList3 = arrayList13;
                                    arrayList4 = arrayList12;
                                }
                                if (arrayList4.size() > 0) {
                                    AbstractC19646n0.m102905K(ComposeNewChatView.this.m79024GM(arrayList4).m155392f(), c31973j52);
                                }
                                if (arrayList11.size() > 0) {
                                    AbstractC19646n0.m102963c1(ComposeNewChatView.this.m79024GM(arrayList11).m155392f(), c31973j52);
                                }
                                if (arrayList3.size() <= 0 && arrayList2.size() <= 0) {
                                    arrayList7 = arrayList3;
                                    arrayList9 = new ArrayList();
                                    it2 = ComposeNewChatView.this.f72889e2.iterator();
                                    while (it2.hasNext()) {
                                        InviteContactProfile inviteContactProfile = (InviteContactProfile) it2.next();
                                        if (inviteContactProfile != null && !AbstractC21935u.m114556w(inviteContactProfile.f42434r) && !arrayList7.contains(inviteContactProfile.f42434r) && !arrayList2.contains(inviteContactProfile.f42434r)) {
                                            arrayList9.add(inviteContactProfile);
                                        }
                                    }
                                    if (!z11 && !arrayList9.isEmpty()) {
                                        AbstractC19646n0.m102992j2(arrayList9, c31973j52);
                                    }
                                    if (arrayList.size() > 0) {
                                        AbstractC19646n0.m102944X(ComposeNewChatView.this.m79024GM(arrayList).m155392f(), c31973j52);
                                    }
                                    if (!TextUtils.isEmpty(optString6)) {
                                        ToastUtils.showMess(optString6);
                                    }
                                    final ContactProfile contactProfile22 = new ContactProfile(i12, optString);
                                    contactProfile22.f42437s = optString2;
                                    contactProfile22.f42446v = optString5;
                                    if (ComposeNewChatView.this.f72421L0.m92676n2() != null) {
                                        ComposeNewChatView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.x8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ComposeNewChatView.C14183k.this.m79048d(contactProfile22, c31973j52);
                                            }
                                        });
                                    }
                                }
                                arrayList5 = new ArrayList();
                                arrayList6 = new ArrayList();
                                it = ComposeNewChatView.this.f72889e2.iterator();
                                while (it.hasNext()) {
                                    InviteContactProfile inviteContactProfile2 = (InviteContactProfile) it.next();
                                    if (inviteContactProfile2 != null) {
                                        arrayList8 = arrayList3;
                                        if (arrayList8.contains(inviteContactProfile2.f42434r)) {
                                            arrayList5.add(inviteContactProfile2);
                                        } else if (arrayList2.contains(inviteContactProfile2.f42434r)) {
                                            arrayList6.add(inviteContactProfile2);
                                        }
                                    } else {
                                        arrayList8 = arrayList3;
                                    }
                                    arrayList3 = arrayList8;
                                }
                                arrayList7 = arrayList3;
                                if (!arrayList5.isEmpty()) {
                                    AbstractC19646n0.m102947Y(arrayList5, c31973j52);
                                }
                                if (!arrayList6.isEmpty()) {
                                    AbstractC19646n0.m102920P(arrayList6, c31973j52);
                                }
                                arrayList9 = new ArrayList();
                                it2 = ComposeNewChatView.this.f72889e2.iterator();
                                while (it2.hasNext()) {
                                }
                                if (!z11) {
                                    AbstractC19646n0.m102992j2(arrayList9, c31973j52);
                                }
                                if (arrayList.size() > 0) {
                                }
                                if (!TextUtils.isEmpty(optString6)) {
                                }
                                final ContactProfile contactProfile222 = new ContactProfile(i12, optString);
                                contactProfile222.f42437s = optString2;
                                contactProfile222.f42446v = optString5;
                                if (ComposeNewChatView.this.f72421L0.m92676n2() != null) {
                                }
                            }
                        }
                    }
                    i12 = 1;
                    c31973j52 = c31973j5;
                    if (!TextUtils.isEmpty(ComposeNewChatView.this.f72910w1)) {
                    }
                    if (c31973j52 != null) {
                    }
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            ComposeNewChatView.this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: LM */
    private void m78979LM() {
        this.f72900m1.m72709oO(new C14175c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ boolean m78980MM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                m79036lN();
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m78981NM() {
        m79032gN(this.f72846D1.m155392f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m78982OM() {
        JSONObject optJSONObject;
        ContactProfile m141811g;
        JSONObject optJSONObject2;
        try {
            this.f72847E1 = m79027JM(true);
            this.f72848F1 = m79027JM(false);
            this.f72849G1 = m79026IM();
            try {
                this.f72846D1.m155389c();
                if (!TextUtils.isEmpty(this.f72903p1)) {
                    JSONObject jSONObject = new JSONObject(this.f72903p1);
                    if (jSONObject.has("suggestGroupName") && (optJSONObject2 = jSONObject.optJSONObject("suggestGroupName")) != null) {
                        String optString = optJSONObject2.optString("name");
                        if (!TextUtils.isEmpty(optString)) {
                            this.f72904q1 = optString.trim();
                        }
                        this.f72887d2 = optJSONObject2.optInt("forceSetName");
                    }
                    if (jSONObject.has("suggestGroupMember") && (optJSONObject = jSONObject.optJSONObject("suggestGroupMember")) != null) {
                        JSONArray optJSONArray = optJSONObject.optJSONArray("memberList");
                        if (optJSONArray != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i11);
                                String optString2 = jSONObject2.optString("id");
                                String optString3 = jSONObject2.optString("dName");
                                String optString4 = jSONObject2.optString("avatar");
                                if ((TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4)) && (m141811g = C28203u6.f131407a.m141811g(optString2)) != null) {
                                    optString3 = m141811g.m40383Q(true, false);
                                    optString4 = m141811g.f42446v;
                                }
                                InviteContactProfile inviteContactProfile = new InviteContactProfile(optString2, optString4, optString3);
                                if (C28146o3.m141655e(inviteContactProfile, false)) {
                                    this.f72846D1.m155387a(inviteContactProfile);
                                    this.f72847E1.m155396j(inviteContactProfile);
                                    this.f72848F1.m155396j(inviteContactProfile);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(optJSONObject.optString("sectionLabel"))) {
                            this.f72859P1 = optJSONObject.optString("sectionLabel");
                        }
                        if (optJSONObject.optInt("autoSelect") == 1) {
                            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.k8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ComposeNewChatView.this.m78981NM();
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f72854L1.m155389c();
            Iterator it = C21927m.m114302u().m114367y().iterator();
            while (it.hasNext()) {
                String m154511b = ((C32035n7) it.next()).m154511b();
                if (this.f72849G1.m155390d(m154511b)) {
                    InviteContactProfile m155393g = this.f72849G1.m155393g(m154511b);
                    this.f72854L1.m155387a(m155393g);
                    this.f72847E1.m155396j(m155393g);
                    this.f72848F1.m155396j(m155393g);
                }
            }
            m79030eN();
            if (this.f72855M1.size() > 0) {
                Iterator it2 = this.f72851I1.m155392f().iterator();
                while (it2.hasNext()) {
                    InviteContactProfile inviteContactProfile2 = (InviteContactProfile) it2.next();
                    if (this.f72855M1.contains(inviteContactProfile2.f42434r)) {
                        m79031fN(inviteContactProfile2);
                    }
                }
            }
            m79039nN(this.f72875X1);
            m79019BM();
            this.f72871V1 = true;
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m78983PM(ArrayList arrayList) {
        this.f72901n1.m35818Q(arrayList);
        this.f72901n1.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public /* synthetic */ void m78984QM() {
        this.f72901n1.m10008p();
        this.f72902o1.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public /* synthetic */ void m78985RM() {
        this.f72901n1.m10008p();
        this.f72902o1.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public /* synthetic */ void m78986SM(int i11) {
        this.f72858P0.setPaddingBottom(i11);
        this.f72858P0.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public /* synthetic */ void m78987TM(int i11) {
        if (this.f72900m1 == null) {
            m79028KM(i11);
        } else {
            C23744a.m124114c().m124116d(8006, Integer.valueOf(i11));
        }
        m79002jN(this.f72900m1, true);
        AppCompatImageView appCompatImageView = this.f72894h1;
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView.getContext(), AbstractC16803z.icn_emoji_o));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public /* synthetic */ void m78988UM(View view) {
        if (this.f72875X1 == 0) {
            m79039nN(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public /* synthetic */ void m78989VM(Object obj) {
        this.f72870V0.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public /* synthetic */ void m78990WM(Object obj) {
        InviteContactProfile inviteContactProfile;
        try {
            if ((obj instanceof C31952i) && (inviteContactProfile = ((C31952i) obj).f146846a) != null) {
                m79041qN(inviteContactProfile);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public /* synthetic */ void m78991XM(int i11) {
        LinearLayoutManager linearLayoutManager;
        int m9740Y1;
        View mo9732P;
        try {
            if (!this.f72871V1 || (m9740Y1 = (linearLayoutManager = (LinearLayoutManager) this.f72864S0.getLayoutManager()).m9740Y1()) == -1 || (mo9732P = linearLayoutManager.mo9732P(m9740Y1)) == null) {
                return;
            }
            linearLayoutManager.m9721B2(m9740Y1, mo9732P.getTop() - i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public /* synthetic */ boolean m78992YM(TextView textView, int i11, KeyEvent keyEvent) {
        InviteContactProfile inviteContactProfile;
        try {
            if (this.f72875X1 == 2 && i11 == 6) {
                C32141v0 m35814M = this.f72902o1.m35814M(0);
                int i12 = 0;
                while (m35814M != null && m35814M.f148235b != 0) {
                    i12++;
                    m35814M = this.f72902o1.m35814M(i12);
                }
                if (m35814M != null && (inviteContactProfile = m35814M.f148234a) != null && !this.f72902o1.f38253v.contains(inviteContactProfile.f42434r)) {
                    m79021DM(inviteContactProfile);
                }
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public /* synthetic */ void m78993ZM(RecyclerView recyclerView, int i11, View view) {
        try {
            int mo10005m = this.f72901n1.mo10005m(i11);
            if (mo10005m != 0) {
                if (mo10005m == 4) {
                    int i12 = ((QuickCreateGroupAdapter.C6996g) this.f72901n1.m35814M(i11)).f38275e;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            this.f72856N1 = true;
                            this.f72869U1.removeCallbacks(this.f72873W1);
                            this.f72869U1.post(this.f72873W1);
                        }
                    } else {
                        this.f72857O1 = true;
                        this.f72869U1.removeCallbacks(this.f72873W1);
                        this.f72869U1.post(this.f72873W1);
                    }
                }
            } else {
                InviteContactProfile m35813L = this.f72901n1.m35813L(i11);
                if (m35813L != null) {
                    m79021DM(m35813L);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ void m78994aN(RecyclerView recyclerView, int i11, View view) {
        InviteContactProfile m35813L;
        try {
            if (this.f72902o1.mo10005m(i11) == 0 && (m35813L = this.f72902o1.m35813L(i11)) != null) {
                m79021DM(m35813L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m78995bN(int i11) {
        try {
            this.f72875X1 = i11;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f72864S0.setVisibility(8);
                        this.f72866T0.setVisibility(0);
                    }
                } else {
                    this.f72864S0.setVisibility(0);
                    this.f72866T0.setVisibility(8);
                }
            } else {
                this.f72870V0.setText("");
                this.f72864S0.setVisibility(8);
                this.f72866T0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public /* synthetic */ boolean m78996cN(TextView textView, int i11, KeyEvent keyEvent) {
        try {
            if (this.f72877Y1 == 4 && i11 == 6) {
                this.f72904q1 = this.f72884c1.getText().toString().trim();
                this.f72870V0.requestFocus();
                m79040oN(3);
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public /* synthetic */ void m78997dN(View view, boolean z11) {
        if (z11) {
            this.f72884c1.setHint("");
        } else {
            this.f72884c1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_group_name_hint));
        }
    }

    /* renamed from: jN */
    private void m79002jN(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: pN */
    private void m79009pN() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f72900m1 = (StickerPanelView) m92996E0;
        }
        if (this.f72900m1 != null) {
            m78979LM();
        }
    }

    /* renamed from: AM */
    ArrayList m79018AM(C32223a c32223a, int i11) {
        ArrayList arrayList = new ArrayList();
        if (i11 >= 0) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (c32223a.m155397k() >= i11) {
                for (int i12 = 0; i12 < i11; i12++) {
                    arrayList.add(new C32141v0(0, (InviteContactProfile) c32223a.m155392f().get(i12)));
                }
                return arrayList;
            }
        }
        Iterator it = c32223a.m155392f().iterator();
        while (it.hasNext()) {
            arrayList.add(new C32141v0(0, (InviteContactProfile) it.next()));
        }
        return arrayList;
    }

    /* renamed from: BM */
    void m79019BM() {
        try {
            if (this.f72901n1.f38253v.size() >= 2) {
                m79038mN(1);
            } else {
                m79038mN(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72865S1 = System.currentTimeMillis();
        this.f72421L0.m92676n2().mo35554O(32);
        this.f72421L0.m92637BK(false);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f72903p1 = m92642L3.getString("extra_preload_data", "");
            this.f72906s1 = m92642L3.getShort("SHORT_EXTRA_CREATE_SOURCE", (short) 5);
            this.f72910w1 = m92642L3.getString("EXTRA_SUGGEST_ID", "");
        }
        this.f72907t1 = AbstractC23309i.m122636z0();
        this.f72908u1 = AbstractC23309i.m121078J8();
        if (bundle != null) {
            try {
                if (bundle.containsKey("arrItemSelected")) {
                    this.f72855M1.addAll(bundle.getStringArrayList("arrItemSelected"));
                }
                if (bundle.containsKey("arrStrangerContacts")) {
                    JSONArray jSONArray = new JSONArray(bundle.getString("arrStrangerContacts"));
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        this.f72850H1.m155387a(new InviteContactProfile(jSONArray.getJSONObject(i11)));
                    }
                }
                if (bundle.containsKey("groupName")) {
                    this.f72904q1 = bundle.getString("groupName").trim();
                }
                if (bundle.containsKey("chatMsg")) {
                    this.f72905r1 = bundle.getString("chatMsg").trim();
                }
                m79009pN();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: CM */
    void m79020CM() {
        QuickCreateGroupAdapter quickCreateGroupAdapter = this.f72901n1;
        if (quickCreateGroupAdapter != null && quickCreateGroupAdapter.f38253v.size() > 0) {
            if (this.f72892g1 == null) {
                View inflate = this.f72890f1.inflate();
                this.f72892g1 = inflate;
                AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(AbstractC6918a0.img_emo_sticker);
                this.f72894h1 = appCompatImageView;
                appCompatImageView.setOnClickListener(this);
                EditText editText = (EditText) this.f72892g1.findViewById(AbstractC6918a0.input_text_msg);
                this.f72896i1 = editText;
                editText.setOnTouchListener(this);
                this.f72896i1.addTextChangedListener(new C14179g());
                if (AbstractC23309i.m121699a0()) {
                    this.f72896i1.setImeOptions(268435460);
                } else {
                    this.f72896i1.setImeOptions(268435457);
                }
                this.f72896i1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.i8
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                        boolean m78980MM;
                        m78980MM = ComposeNewChatView.this.m78980MM(textView, i11, keyEvent);
                        return m78980MM;
                    }
                });
                if (!TextUtils.isEmpty(this.f72905r1)) {
                    this.f72896i1.setText(this.f72905r1);
                }
                View findViewById = this.f72892g1.findViewById(AbstractC6918a0.send_btn);
                this.f72897j1 = findViewById;
                findViewById.setOnClickListener(this);
            }
            this.f72892g1.setVisibility(0);
            return;
        }
        View view = this.f72892g1;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.f72893g2 == 2) {
            m79029Ka(1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    return null;
                }
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_quit_creating_group)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this);
                return aVar.m43152a();
            }
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            aVar2.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_group_add_too_much_strangers)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this);
            C8009j m43152a = aVar2.m43152a();
            m43152a.m92873y(true);
            return m43152a;
        }
        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
        aVar3.m43159h(4).m43162k(AbstractC23136l9.m118746s0(AbstractC8020f0.str_dialog_msg_user_join_over_max_groups, Integer.valueOf(this.f72885c2))).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_choose_group_to_leave), this);
        C8009j m43152a2 = aVar3.m43152a();
        m43152a2.m92873y(true);
        return m43152a2;
    }

    /* renamed from: DM */
    public void m79021DM(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile == null) {
            return;
        }
        try {
            if (this.f72901n1.f38253v.contains(inviteContactProfile.f42434r)) {
                m79041qN(inviteContactProfile);
            } else {
                m79031fN(inviteContactProfile);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EM */
    boolean m79022EM() {
        if (this.f72901n1.f38253v.size() >= 2) {
            this.f72421L0.showDialog(4);
            return true;
        }
        if (this.f72906s1 == 5) {
            if (this.f72901n1.f38253v.size() > 0) {
                AbstractC23647d.m123897g("27427");
            } else {
                AbstractC23647d.m123897g("27429");
            }
        }
        finish();
        return false;
    }

    /* renamed from: FM */
    void m79023FM() {
        boolean z11;
        double d11;
        double d12;
        boolean z12;
        if (this.f72901n1.f38253v.size() == 0 || this.f72883b2) {
            return;
        }
        this.f72883b2 = true;
        this.f72889e2 = this.f72853K1.m155392f();
        String str = this.f72904q1;
        if (TextUtils.isEmpty(str)) {
            if (this.f72887d2 == 1) {
                ToastUtils.m89266n(AbstractC8020f0.str_require_group_name, new Object[0]);
                m79038mN(1);
                this.f72883b2 = false;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42437s)) {
                sb2.append(AbstractC23304d.f113368c0.f42437s);
            }
            for (int i11 = 0; i11 < Math.min(this.f72889e2.size(), 3); i11++) {
                String mo2475c = ((InviteContactProfile) this.f72889e2.get(i11)).mo2475c();
                sb2.append(", ");
                sb2.append(mo2475c);
            }
            str = sb2.toString();
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f72889e2.size() == 1) {
            String str2 = ((InviteContactProfile) this.f72889e2.get(0)).f42434r;
            try {
                ContactProfile m98552o = C18644n.m98531l().m98552o(str2);
                if (m98552o != null) {
                    Bundle m140776b = new C27870vb(str2).m140780g(m98552o).m140776b();
                    if (!TextUtils.isEmpty("")) {
                        m140776b.putString("msgToCreateGroup", "");
                    }
                    m140776b.putInt("SHOW_WITH_FLAGS", 33554432);
                    if (this.f72421L0.m92676n2() != null) {
                        this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                    }
                } else {
                    m98552o = C28203u6.f131407a.m141809c(str2);
                    if (m98552o != null) {
                        Bundle m140776b2 = new C27870vb(str2).m140780g(m98552o).m140776b();
                        if (!TextUtils.isEmpty("")) {
                            m140776b2.putString("msgToCreateGroup", "");
                        }
                        m140776b2.putInt("SHOW_WITH_FLAGS", 33554432);
                        if (this.f72421L0.m92676n2() != null) {
                            this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b2, 1, true);
                        }
                    } else {
                        Iterator it = this.f72889e2.iterator();
                        while (it.hasNext()) {
                            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                            if (inviteContactProfile.f42434r.equals(str2)) {
                                inviteContactProfile.f42455y = "";
                                C0824j.m2153b(new C14182j(inviteContactProfile));
                                Bundle m140776b3 = new C27870vb(inviteContactProfile.mo2478b()).m140780g(inviteContactProfile).m140776b();
                                if (!TextUtils.isEmpty("")) {
                                    m140776b3.putString("msgToCreateGroup", "");
                                }
                                m140776b3.putInt("SHOW_WITH_FLAGS", 33554432);
                                if (this.f72421L0.m92676n2() != null) {
                                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b3, 1, true);
                                }
                                m98552o = inviteContactProfile;
                            }
                        }
                    }
                }
                if (m98552o != null && this.f72911x1 != null) {
                    AbstractC23112j7.m118513W(m98552o.mo2478b(), this.f72911x1);
                    return;
                }
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14183k());
        if (str.length() > 50) {
            str = str.substring(0, 50);
        }
        String str3 = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        Location m141673c = C28157p5.m141667d().m141673c();
        if (m141673c != null) {
            d11 = m141673c.getLatitude();
            d12 = m141673c.getLongitude();
        } else {
            d11 = 0.0d;
            d12 = 0.0d;
        }
        if (this.f72911x1 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        c0766k.mo1721q9(new C32039nb(this.f72865S1, System.currentTimeMillis(), z12).toString(), str3, "", this.f72889e2, z11, this.f72910w1, 0, 0, true, this.f72906s1, arrayList, d11, d12, null, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3()) {
            if (this.f72421L0.m92676n2() instanceof Activity) {
                this.f72421L0.m92676n2().mo35554O(32);
            }
        } else if (this.f72421L0.m92676n2() instanceof Activity) {
            this.f72421L0.m92676n2().mo35554O(18);
        }
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) layoutInflater.inflate(AbstractC7409c0.new_chat_layout, viewGroup, false);
        this.f72858P0 = keyboardFrameLayout;
        keyboardFrameLayout.getRootView().setBackgroundColor(C23212s8.m119607o(this.f72858P0.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        this.f72858P0.setOnClickListener(this);
        m79034iN();
        return this.f72858P0;
    }

    /* renamed from: GM */
    C32223a m79024GM(ArrayList arrayList) {
        C32223a c32223a = new C32223a();
        try {
            if (arrayList.size() > 0) {
                Iterator it = this.f72851I1.m155392f().iterator();
                while (it.hasNext()) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                    if (arrayList.contains(inviteContactProfile.f42434r)) {
                        c32223a.m155387a(inviteContactProfile);
                        if (c32223a.m155397k() >= arrayList.size()) {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c32223a;
    }

    /* renamed from: HM */
    void m79025HM() {
        if (this.f72900m1 != null) {
            m79033hN(8);
        }
        AppCompatImageView appCompatImageView = this.f72894h1;
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView.getContext(), AbstractC16803z.icn_emoji));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        HandlerThread handlerThread = this.f72867T1;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        super.mo39024IJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: IM */
    C32223a m79026IM() {
        C32223a c32223a = new C32223a();
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
        for (int i11 = 0; i11 < mo98465a.size(); i11++) {
            try {
                ContactProfile contactProfile = (ContactProfile) mo98465a.get(i11);
                if (contactProfile != null) {
                    c32223a.m155387a(new InviteContactProfile(contactProfile));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return c32223a;
    }

    /* renamed from: JM */
    C32223a m79027JM(boolean z11) {
        boolean z12;
        C32223a c32223a = new C32223a();
        try {
            boolean m119445c = AbstractC23184q2.m119445c();
            C19669z m103146Y = C19669z.m103146Y();
            if (z11 && m119445c) {
                z12 = true;
            } else {
                z12 = false;
            }
            c32223a.m155388b(m103146Y.m103224k0(z12, false));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c32223a;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 1) {
            if (mo92862f != 2) {
                if (mo92862f == 4 && i11 == -1) {
                    if (this.f72906s1 == 5) {
                        AbstractC23647d.m123897g("27427");
                    }
                    interfaceC17463d.dismiss();
                    finish();
                    return;
                }
                return;
            }
            interfaceC17463d.dismiss();
            return;
        }
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            AbstractC23184q2.m119464v(this.f72421L0);
        } else if (i11 == -2) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: KM */
    void m79028KM(int i11) {
        this.f72899l1 = this.f72898k1.inflate().findViewById(AbstractC6918a0.parentview_sticker_panel);
        ArrayList<View> arrayList = new ArrayList<>();
        View view = this.f72899l1;
        if (view != null) {
            arrayList.add(view);
        }
        this.f72858P0.setBottomViewsGroup(arrayList);
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, true, true, null, null, false, 400, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f72421L0.m92676n2()), true, 25, AbstractC16781w.indicator_bg_color, true, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f72900m1 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f72900m1, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m78979LM();
        }
    }

    /* renamed from: Ka */
    void m79029Ka(int i11) {
        final int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        this.f72893g2 = i11;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f72870V0.clearFocus();
                        AbstractC2379w.m12430d(this.f72870V0);
                        this.f72858P0.setPaddingBottom(m122007i5);
                        this.f72858P0.requestLayout();
                        mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.e8
                            @Override // java.lang.Runnable
                            public final void run() {
                                ComposeNewChatView.this.m78987TM(m122007i5);
                            }
                        }, 100L);
                        return;
                    }
                    return;
                }
                EditText editText = this.f72870V0;
                if (editText != null && editText.isFocused()) {
                    AbstractC2379w.m12432f(this.f72870V0);
                    this.f72870V0.requestFocus();
                } else {
                    EditText editText2 = this.f72896i1;
                    if (editText2 != null && editText2.isFocused()) {
                        AbstractC2379w.m12432f(this.f72896i1);
                        this.f72896i1.requestFocus();
                    }
                }
                m79025HM();
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.v8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComposeNewChatView.this.m78986SM(m122007i5);
                    }
                });
                return;
            }
            this.f72870V0.clearFocus();
            AbstractC2379w.m12430d(this.f72870V0);
            m79025HM();
            this.f72858P0.setPaddingBottom(0);
            this.f72858P0.requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                if (m79022EM()) {
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        HashSet hashSet;
        try {
            QuickCreateGroupAdapter quickCreateGroupAdapter = this.f72901n1;
            if (quickCreateGroupAdapter != null && (hashSet = quickCreateGroupAdapter.f38253v) != null && hashSet.size() > 0) {
                bundle.putStringArrayList("arrItemSelected", new ArrayList<>(this.f72901n1.f38253v));
            }
            if (!this.f72850H1.m155395i()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f72850H1.m155392f().iterator();
                while (it.hasNext()) {
                    jSONArray.put(((InviteContactProfile) it.next()).m40488x1());
                }
                bundle.putString("arrStrangerContacts", jSONArray.toString());
            }
            bundle.putString("groupName", this.f72904q1);
            EditText editText = this.f72896i1;
            if (editText != null) {
                bundle.putString("chatMsg", editText.getText().toString());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(null);
                this.f88760a0.setSubtitle(null);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
                this.f88760a0.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.actionbar_leftview_new_chat_layout, (ViewGroup) null, false);
                this.f72874X0 = inflate;
                RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.group_name_tv);
                this.f72876Y0 = robotoTextView;
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
                RobotoTextView robotoTextView2 = this.f72876Y0;
                robotoTextView2.setHintTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC21196a.TextColor2));
                this.f72878Z0 = (ImageView) this.f72874X0.findViewById(AbstractC6918a0.edit_group_name_icn);
                this.f72874X0.setOnClickListener(this);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 5;
                layoutParams.leftMargin = AbstractC23222t7.f112539R;
                this.f88760a0.m92707b(this.f72874X0, layoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eN */
    public void m79030eN() {
        try {
            final ArrayList arrayList = new ArrayList();
            this.f72851I1.m155389c();
            this.f72852J1.m155389c();
            if (this.f72850H1.m155397k() > 0) {
                arrayList.add(new QuickCreateGroupAdapter.C6995f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invite_to_group_stranger_section_header)));
                this.f72851I1.m155388b(this.f72850H1.m155392f());
                this.f72852J1.m155388b(this.f72850H1.m155392f());
                arrayList.addAll(m79018AM(this.f72850H1, -1));
                arrayList.add(new C32141v0(3, null));
            }
            if (this.f72846D1.m155397k() > 0 || this.f72847E1.m155397k() > 0 || this.f72854L1.m155397k() > 0) {
                arrayList.add(new QuickCreateGroupAdapter.C6995f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggestion_for_you)));
                if (this.f72846D1.m155397k() > 0) {
                    this.f72851I1.m155388b(this.f72846D1.m155392f());
                    this.f72852J1.m155388b(this.f72846D1.m155392f());
                    if (!this.f72857O1 && this.f72846D1.m155397k() >= 5) {
                        arrayList.addAll(m79043yM(this.f72846D1, 5, this.f72859P1));
                        arrayList.add(new QuickCreateGroupAdapter.C6996g(1));
                    }
                    arrayList.addAll(m79043yM(this.f72846D1, -1, this.f72859P1));
                }
                if (this.f72854L1.m155397k() > 0) {
                    this.f72851I1.m155388b(this.f72854L1.m155392f());
                    this.f72852J1.m155388b(this.f72854L1.m155392f());
                    arrayList.addAll(m79043yM(this.f72854L1, -1, this.f72863R1));
                }
                if (this.f72847E1.m155397k() > 0) {
                    this.f72851I1.m155388b(this.f72847E1.m155392f());
                    if (!this.f72856N1 && this.f72847E1.m155397k() >= 5) {
                        arrayList.addAll(m79043yM(this.f72847E1, 5, this.f72861Q1));
                        arrayList.add(new QuickCreateGroupAdapter.C6996g(2));
                    }
                    arrayList.addAll(m79043yM(this.f72847E1, 20, this.f72861Q1));
                }
                arrayList.add(new C32141v0(3, null));
            }
            if (this.f72848F1.m155397k() > 0) {
                this.f72852J1.m155388b(this.f72848F1.m155392f());
            }
            if (this.f72849G1.m155397k() > 0) {
                arrayList.add(new QuickCreateGroupAdapter.C6995f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_contact)));
                this.f72851I1.m155388b(this.f72849G1.m155392f());
                this.f72852J1.m155388b(this.f72849G1.m155392f());
                arrayList.addAll(m79044zM(this.f72849G1));
            }
            this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.l8
                @Override // java.lang.Runnable
                public final void run() {
                    ComposeNewChatView.this.m78983PM(arrayList);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fN */
    public void m79031fN(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile != null) {
            try {
                if (!this.f72901n1.f38253v.contains(inviteContactProfile.f42434r)) {
                    int size = this.f72901n1.f38253v.size() + 1;
                    if (!AbstractC21935u.m114554u(inviteContactProfile.f42434r)) {
                        if (this.f72850H1.m155397k() >= this.f72908u1) {
                            this.f72421L0.showDialog(2);
                            return;
                        }
                        InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
                        if (inviteContactMask != null && inviteContactMask.f42537s == 3) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_emptyResult));
                            return;
                        } else if (inviteContactMask != null && !this.f72850H1.m155391e(inviteContactProfile)) {
                            this.f72850H1.m155387a(inviteContactProfile);
                            this.f72869U1.removeCallbacks(this.f72873W1);
                            this.f72869U1.post(this.f72873W1);
                        }
                    }
                    int i11 = this.f72907t1;
                    if (size < i11) {
                        this.f72901n1.f38253v.add(inviteContactProfile.f42434r);
                        this.f72902o1.f38253v.add(inviteContactProfile.f42434r);
                        this.f72853K1.m155387a(inviteContactProfile);
                        this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.j8
                            @Override // java.lang.Runnable
                            public final void run() {
                                ComposeNewChatView.this.m78984QM();
                            }
                        });
                        C31952i c31952i = new C31952i(inviteContactProfile);
                        this.f72868U0.m37541h(c31952i);
                        this.f72845C1.put(inviteContactProfile.f42434r, c31952i);
                        m79019BM();
                        m79020CM();
                        if (this.f72901n1.f38253v.size() > 0) {
                            this.f72870V0.setHint(" " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_add_member_newchat));
                            return;
                        }
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_warning_limit_member_to_invite, Integer.valueOf(i11)));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gN */
    public void m79032gN(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                if (inviteContactProfile != null && !this.f72901n1.f38253v.contains(inviteContactProfile.f42434r)) {
                    int size = this.f72901n1.f38253v.size() + 1;
                    if (!AbstractC21935u.m114554u(inviteContactProfile.f42434r)) {
                        if (this.f72850H1.m155397k() >= this.f72908u1) {
                            z11 = true;
                        } else {
                            InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
                            if (inviteContactMask != null && inviteContactMask.f42537s == 3) {
                                z12 = true;
                            } else if (inviteContactMask != null && !this.f72850H1.m155391e(inviteContactProfile)) {
                                this.f72850H1.m155387a(inviteContactProfile);
                                z13 = true;
                            }
                        }
                    }
                    if (size < this.f72907t1) {
                        this.f72901n1.f38253v.add(inviteContactProfile.f42434r);
                        this.f72902o1.f38253v.add(inviteContactProfile.f42434r);
                        this.f72853K1.m155387a(inviteContactProfile);
                        C31952i c31952i = new C31952i(inviteContactProfile);
                        this.f72868U0.m37541h(c31952i);
                        this.f72845C1.put(inviteContactProfile.f42434r, c31952i);
                        z14 = true;
                    } else {
                        z15 = true;
                    }
                }
            }
            if (z11) {
                this.f72421L0.showDialog(2);
            }
            if (z12) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_emptyResult));
            }
            if (z13) {
                this.f72869U1.removeCallbacks(this.f72873W1);
                this.f72869U1.post(this.f72873W1);
            }
            if (z14) {
                this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.m8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComposeNewChatView.this.m78985RM();
                    }
                });
                m79019BM();
                m79020CM();
                if (this.f72901n1.f38253v.size() > 0) {
                    this.f72870V0.setHint(" " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_add_member_newchat));
                }
            }
            if (z15) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_warning_limit_member_to_invite, Integer.valueOf(this.f72907t1)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ComposeNewChatView";
    }

    /* renamed from: hN */
    void m79033hN(int i11) {
        View view = this.f72899l1;
        if (view != null) {
            view.setVisibility(i11);
            int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
            if (this.f72899l1.getHeight() != m122007i5) {
                this.f72899l1.getLayoutParams().height = m122007i5;
                this.f72899l1.requestLayout();
            }
        }
    }

    /* renamed from: iN */
    void m79034iN() {
        try {
            View findViewById = this.f72858P0.findViewById(AbstractC6918a0.main_layout);
            this.f72860Q0 = findViewById;
            this.f72858P0.setTopViewGroup(findViewById);
            this.f72858P0.setOnKeyboardListener(new C14176d());
            this.f72862R0 = (MultiStateView) this.f72858P0.findViewById(AbstractC6918a0.multi_state);
            IconBubbleEditText iconBubbleEditText = (IconBubbleEditText) this.f72858P0.findViewById(AbstractC6918a0.bubble);
            this.f72868U0 = iconBubbleEditText;
            iconBubbleEditText.setOnBubbleClickCallback(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.o8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ComposeNewChatView.this.m78988UM(view);
                }
            });
            this.f72868U0.setOnItemClickCallback(new IconBubbleEditText.InterfaceC7394d() { // from class: com.zing.zalo.ui.zviews.p8
                @Override // com.zing.zalo.bubbleview.IconBubbleEditText.InterfaceC7394d
                /* renamed from: a */
                public final void mo37553a(Object obj) {
                    ComposeNewChatView.this.m78989VM(obj);
                }
            });
            this.f72868U0.setOnItemDeletedCallback(new IconBubbleEditText.InterfaceC7395e() { // from class: com.zing.zalo.ui.zviews.q8
                @Override // com.zing.zalo.bubbleview.IconBubbleEditText.InterfaceC7395e
                /* renamed from: a */
                public final void mo37554a(Object obj) {
                    ComposeNewChatView.this.m78990WM(obj);
                }
            });
            this.f72868U0.setOnHeightChange(new IconBubbleEditText.InterfaceC7396f() { // from class: com.zing.zalo.ui.zviews.r8
                @Override // com.zing.zalo.bubbleview.IconBubbleEditText.InterfaceC7396f
                /* renamed from: a */
                public final void mo37555a(int i11) {
                    ComposeNewChatView.this.m78991XM(i11);
                }
            });
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f72858P0.findViewById(AbstractC6918a0.btn_input_type);
            this.f72872W0 = appCompatImageView;
            appCompatImageView.setOnClickListener(this);
            ActionEditText editText = this.f72868U0.getEditText();
            this.f72870V0 = editText;
            editText.setHint(" " + AbstractC23136l9.m118743r0(AbstractC8020f0.hint_search_create_group));
            this.f72870V0.setOnTouchListener(this);
            this.f72870V0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.s8
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m78992YM;
                    m78992YM = ComposeNewChatView.this.m78992YM(textView, i11, keyEvent);
                    return m78992YM;
                }
            });
            this.f72870V0.addTextChangedListener(this.f72844B1);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f72858P0.findViewById(AbstractC6918a0.btn_input_type);
            this.f72872W0 = appCompatImageView2;
            appCompatImageView2.setOnClickListener(this);
            this.f72864S0 = (RecyclerView) this.f72858P0.findViewById(AbstractC6918a0.contact_list);
            this.f72864S0.setLayoutManager(new LinearLayoutManager(this.f72421L0.getContext()));
            QuickCreateGroupAdapter quickCreateGroupAdapter = new QuickCreateGroupAdapter(this.f72421L0.getContext(), new HashSet(), false, 0);
            this.f72901n1 = quickCreateGroupAdapter;
            this.f72864S0.setAdapter(quickCreateGroupAdapter);
            this.f72864S0.m9826E(new C14177e());
            C31784b.m152808a(this.f72864S0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.t8
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    ComposeNewChatView.this.m78993ZM(recyclerView, i11, view);
                }
            });
            this.f72866T0 = (RecyclerView) this.f72858P0.findViewById(AbstractC6918a0.search_list);
            this.f72866T0.setLayoutManager(new LinearLayoutManager(this.f72421L0.getContext()));
            QuickCreateGroupAdapter quickCreateGroupAdapter2 = new QuickCreateGroupAdapter(this.f72421L0.getContext(), new HashSet(), true, 0);
            this.f72902o1 = quickCreateGroupAdapter2;
            this.f72866T0.setAdapter(quickCreateGroupAdapter2);
            this.f72866T0.m9826E(new C14178f());
            C31784b.m152808a(this.f72866T0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.u8
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    ComposeNewChatView.this.m78994aN(recyclerView, i11, view);
                }
            });
            this.f72880a1 = (ViewStub) this.f72858P0.findViewById(AbstractC6918a0.edit_group_name_stub);
            this.f72890f1 = (ViewStub) this.f72858P0.findViewById(AbstractC6918a0.chat_content_stub);
            this.f72898k1 = (ViewStub) this.f72858P0.findViewById(AbstractC6918a0.sticker_panel_stub);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kN */
    void m79035kN() {
        try {
            EditText editText = this.f72896i1;
            if (editText != null) {
                editText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f72896i1.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lN */
    void m79036lN() {
        try {
            if (this.f72896i1 != null) {
                if (this.f72906s1 == 5 && this.f72901n1.f38253v.size() == 1) {
                    AbstractC23647d.m123897g("27430");
                }
                String trim = this.f72896i1.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    C26404f c26404f = new C26404f(2);
                    this.f72911x1 = c26404f;
                    c26404f.m136168u(trim);
                } else {
                    this.f72911x1 = null;
                }
                m79023FM();
                this.f72868U0.m37550u(null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: le */
    void m79037le(int i11) {
        try {
            if (i11 == 0) {
                mo78955kl(this.f72891f2, 400L);
            } else if (i11 == 1 || i11 == 3) {
                removeCallbacks(this.f72891f2);
                m79035kN();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mN */
    void m79038mN(int i11) {
        this.f72879Z1 = i11;
        removeCallbacks(this.f72881a2);
        mo70710wy(this.f72881a2);
    }

    /* renamed from: nN */
    void m79039nN(final int i11) {
        this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.f8
            @Override // java.lang.Runnable
            public final void run() {
                ComposeNewChatView.this.m78995bN(i11);
            }
        });
    }

    /* renamed from: oN */
    void m79040oN(int i11) {
        try {
            this.f72877Y1 = i11;
            if (i11 != 3) {
                if (i11 == 4) {
                    if (this.f72882b1 == null) {
                        View inflate = this.f72880a1.inflate();
                        this.f72882b1 = inflate;
                        inflate.setOnTouchListener(this);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f72882b1.getLayoutParams();
                        layoutParams.topMargin = AbstractC17484n.Companion.m92931b();
                        this.f72882b1.setLayoutParams(layoutParams);
                        EditText editText = (EditText) this.f72858P0.findViewById(AbstractC6918a0.edit_text_group_name);
                        this.f72884c1 = editText;
                        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.d8
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                                boolean m78996cN;
                                m78996cN = ComposeNewChatView.this.m78996cN(textView, i12, keyEvent);
                                return m78996cN;
                            }
                        });
                        this.f72884c1.addTextChangedListener(new C14180h());
                        this.f72884c1.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.zviews.n8
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view, boolean z11) {
                                ComposeNewChatView.this.m78997dN(view, z11);
                            }
                        });
                        ImageView imageView = (ImageView) this.f72858P0.findViewById(AbstractC6918a0.edit_group_name_done_icn);
                        this.f72886d1 = imageView;
                        imageView.setOnClickListener(this);
                        View findViewById = this.f72858P0.findViewById(AbstractC6918a0.edit_group_name_blank_view);
                        this.f72888e1 = findViewById;
                        findViewById.setOnClickListener(this);
                    }
                    this.f72882b1.setVisibility(0);
                    this.f72884c1.setText(this.f72904q1);
                    this.f72884c1.requestFocus();
                    EditText editText2 = this.f72884c1;
                    editText2.setSelection(editText2.getText().length());
                    AbstractC2379w.m12432f(this.f72884c1);
                    return;
                }
                return;
            }
            m79019BM();
            View view = this.f72882b1;
            if (view != null) {
                view.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        StickerPanelView stickerPanelView = this.f72900m1;
        if (stickerPanelView != null) {
            stickerPanelView.onActivityResult(i11, i12, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.new_chat_id) {
                this.f72868U0.m37550u(null);
                return;
            }
            if (id2 == AbstractC6918a0.actionbar_leftview_newchat) {
                if (this.f72901n1.f38253v.size() >= 2) {
                    m79040oN(4);
                }
                this.f72868U0.m37550u(null);
                return;
            }
            if (id2 == AbstractC6918a0.edit_group_name_done_icn) {
                this.f72904q1 = this.f72884c1.getText().toString().trim();
                this.f72870V0.requestFocus();
                m79040oN(3);
                return;
            }
            if (id2 == AbstractC6918a0.edit_group_name_blank_view) {
                this.f72904q1 = this.f72884c1.getText().toString().trim();
                m79040oN(3);
                return;
            }
            if (id2 == AbstractC6918a0.img_emo_sticker) {
                if (this.f72893g2 == 2) {
                    m79029Ka(1);
                } else {
                    m79029Ka(2);
                }
                this.f72868U0.m37550u(null);
                m79039nN(0);
                return;
            }
            if (id2 == AbstractC6918a0.send_btn) {
                m79036lN();
                return;
            }
            if (id2 == AbstractC6918a0.btn_input_type) {
                if (TextUtils.isEmpty(this.f72870V0.getText())) {
                    this.f72843A1 = !this.f72843A1;
                    m79042rN();
                    AbstractC2379w.m12432f(this.f72870V0);
                    return;
                }
                this.f72870V0.setText("");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                if (this.f72893g2 != 0) {
                    m79029Ka(0);
                } else if (this.f72877Y1 != 3) {
                    m79040oN(3);
                } else if (this.f72875X1 != 0 && this.f72901n1.f38253v.size() > 0) {
                    m79039nN(0);
                } else if (this.f72875X1 != 1 && this.f72901n1.f38253v.size() == 0) {
                    m79039nN(1);
                } else {
                    return m79022EM();
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int id2;
        try {
            id2 = view.getId();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (id2 == AbstractC6918a0.edit_groupname_newchat) {
            return true;
        }
        if (id2 == AbstractC6918a0.input_text_msg) {
            this.f72868U0.m37550u(null);
            m79039nN(0);
            this.f72896i1.requestFocus();
            return false;
        }
        if (id2 == AbstractC6918a0.etpeople_search) {
            this.f72868U0.m37546p();
            this.f72870V0.requestFocus();
            this.f72870V0.setCursorVisible(true);
            EditText editText = this.f72870V0;
            editText.setSelection(editText.getText().toString().length());
            if (this.f72875X1 == 0) {
                m79039nN(1);
            }
            return false;
        }
        return false;
    }

    /* renamed from: qN */
    public void m79041qN(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile != null) {
            try {
                if (this.f72901n1.f38253v.contains(inviteContactProfile.f42434r)) {
                    this.f72901n1.f38253v.remove(inviteContactProfile.f42434r);
                    this.f72902o1.f38253v.remove(inviteContactProfile.f42434r);
                    this.f72853K1.m155396j(inviteContactProfile);
                    this.f72901n1.m10008p();
                    this.f72902o1.m10008p();
                    this.f72868U0.m37547q(this.f72845C1.get(inviteContactProfile.f42434r));
                    this.f72845C1.remove(inviteContactProfile.f42434r);
                    m79019BM();
                    if (this.f72901n1.f38253v.size() == 0) {
                        this.f72870V0.setHint(" " + AbstractC23136l9.m118743r0(AbstractC8020f0.hint_search_create_group));
                        m79039nN(1);
                        m79020CM();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: rN */
    void m79042rN() {
        if (TextUtils.isEmpty(this.f72870V0.getText())) {
            if (this.f72843A1) {
                this.f72870V0.setInputType(172032);
                AppCompatImageView appCompatImageView = this.f72872W0;
                appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView.getContext(), AbstractC16803z.login_123));
                return;
            } else {
                this.f72870V0.setInputType(3);
                AppCompatImageView appCompatImageView2 = this.f72872W0;
                appCompatImageView2.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView2.getContext(), AbstractC16803z.login_abc));
                return;
            }
        }
        AppCompatImageView appCompatImageView3 = this.f72872W0;
        appCompatImageView3.setImageDrawable(AbstractC23136l9.m118665N(appCompatImageView3.getContext(), AbstractC16803z.ic_ipt_clear));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            HandlerThread handlerThread = new HandlerThread("Z:ComposeNewChat", 1);
            this.f72867T1 = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.f72867T1.getLooper());
            this.f72869U1 = handler;
            handler.post(this.f72895h2);
            this.f72870V0.setCursorVisible(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yM */
    ArrayList m79043yM(C32223a c32223a, int i11, String str) {
        ArrayList arrayList = new ArrayList();
        if (i11 >= 0) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (c32223a.m155397k() >= i11) {
                for (int i12 = 0; i12 < i11; i12++) {
                    arrayList.add(new C32141v0(0, (InviteContactProfile) c32223a.m155392f().get(i12), 5, str));
                }
                return arrayList;
            }
        }
        Iterator it = c32223a.m155392f().iterator();
        while (it.hasNext()) {
            arrayList.add(new C32141v0(0, (InviteContactProfile) it.next(), 5, str));
        }
        return arrayList;
    }

    /* renamed from: zM */
    ArrayList m79044zM(C32223a c32223a) {
        QuickCreateGroupAdapter.C6995f c6995f;
        ArrayList arrayList = new ArrayList();
        int m122127lb = AbstractC23309i.m122127lb();
        ArrayList m155392f = c32223a.m155392f();
        char c11 = '#';
        for (int i11 = 0; i11 < m155392f.size(); i11++) {
            try {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) m155392f.get(i11);
                if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) && (m122127lb != 1 || inviteContactProfile.f42382U0 != 0)) {
                    char charAt = ("" + inviteContactProfile.f42440t.trim().charAt(0)).toUpperCase(Locale.ENGLISH).charAt(0);
                    if (i11 > 0) {
                        try {
                            String str = f72842i2;
                            if (str.indexOf(c11) != -1) {
                                if (charAt > c11) {
                                    if (str.indexOf(charAt) != -1) {
                                        QuickCreateGroupAdapter.C6995f c6995f2 = new QuickCreateGroupAdapter.C6995f("" + charAt);
                                        c6995f2.f38274f = true;
                                        arrayList.add(c6995f2);
                                    } else {
                                        QuickCreateGroupAdapter.C6995f c6995f3 = new QuickCreateGroupAdapter.C6995f("##");
                                        c6995f3.f38274f = true;
                                        arrayList.add(c6995f3);
                                    }
                                }
                            } else if (str.indexOf(charAt) != -1) {
                                QuickCreateGroupAdapter.C6995f c6995f4 = new QuickCreateGroupAdapter.C6995f("" + charAt);
                                c6995f4.f38274f = true;
                                arrayList.add(c6995f4);
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                    } else {
                        if (f72842i2.indexOf(charAt) == -1) {
                            c6995f = new QuickCreateGroupAdapter.C6995f("#");
                        } else {
                            c6995f = new QuickCreateGroupAdapter.C6995f("" + charAt);
                        }
                        c6995f.f38274f = false;
                        arrayList.add(c6995f);
                    }
                    inviteContactProfile.f42399a1.clear();
                    arrayList.add(new C32141v0(0, inviteContactProfile, 3));
                    c11 = charAt;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return arrayList;
    }
}
