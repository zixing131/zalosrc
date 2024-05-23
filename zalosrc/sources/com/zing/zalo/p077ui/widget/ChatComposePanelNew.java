package com.zing.zalo.p077ui.widget;

import ak0.InterfaceC0887b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import b40.C2522b;
import c30.C3251l;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.layout.FixUsableHeightFrameLayout;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import gd0.C19406k;
import gd0.InterfaceC19397b;
import ho0.AbstractC20110a;
import java.util.List;
import m90.EnumC22962a;
import mm0.AbstractC23350e;
import p105dn.EnumC18030a;
import p133ek.C18460c;
import p241ij.C20564a;
import p348mi.AbstractC23309i;
import p405ov.C24559a;
import p559uv.C27373c;
import p716zh.C31890dc;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class ChatComposePanelNew extends FixUsableHeightFrameLayout {

    /* renamed from: U */
    private static final String f68999U = "ChatComposePanelNew";

    /* renamed from: A */
    private ChatInputBar f69000A;

    /* renamed from: B */
    private InterfaceC13481j f69001B;

    /* renamed from: C */
    public Handler f69002C;

    /* renamed from: D */
    boolean f69003D;

    /* renamed from: E */
    public Runnable f69004E;

    /* renamed from: F */
    private int f69005F;

    /* renamed from: G */
    private EnumC18030a f69006G;

    /* renamed from: H */
    private String f69007H;

    /* renamed from: I */
    private int f69008I;

    /* renamed from: J */
    private C13306b f69009J;

    /* renamed from: K */
    private boolean f69010K;

    /* renamed from: L */
    QuickPickerView.InterfaceC12655q f69011L;

    /* renamed from: M */
    QuickPickerView.InterfaceC12658t f69012M;

    /* renamed from: N */
    QuickPickerView.InterfaceC12659u f69013N;

    /* renamed from: O */
    private final QuickPickerView.InterfaceC12657s f69014O;

    /* renamed from: P */
    QuickPickerView.InterfaceC12656r f69015P;

    /* renamed from: Q */
    QuickPickerView.InterfaceC12662x f69016Q;

    /* renamed from: R */
    private int f69017R;

    /* renamed from: S */
    private int f69018S;

    /* renamed from: T */
    C19406k f69019T;

    /* renamed from: s */
    private int f69020s;

    /* renamed from: t */
    private int f69021t;

    /* renamed from: u */
    private QuickPickerView f69022u;

    /* renamed from: v */
    private String f69023v;

    /* renamed from: w */
    private boolean f69024w;

    /* renamed from: x */
    private boolean f69025x;

    /* renamed from: y */
    private Conversation f69026y;

    /* renamed from: z */
    private boolean f69027z;

    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C13471a();

        /* renamed from: p */
        int f69028p;

        /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$SavedState$a */
        /* loaded from: classes6.dex */
        class C13471a implements Parcelable.Creator {
            C13471a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, AbstractC13631f abstractC13631f) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f69028p);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f69028p = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$a */
    /* loaded from: classes6.dex */
    public class RunnableC13472a implements Runnable {
        RunnableC13472a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ChatComposePanelNew.this.f69022u != null && ChatComposePanelNew.this.f69022u.m92656bJ() != null && !ChatComposePanelNew.this.f69022u.m92681pJ() && !ChatComposePanelNew.this.f69022u.m92677nJ()) {
                ChatComposePanelNew.this.m75560a0();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$b */
    /* loaded from: classes6.dex */
    public class C13473b implements QuickPickerView.InterfaceC12663y {
        C13473b() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: K */
        public void mo45279K(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64254K(c18460c, str, str2, i11, footerLogData);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: b */
        public void mo45280b() {
            try {
                boolean z11 = ChatComposePanelNew.this.f69027z;
                ChatComposePanelNew.this.f69027z = false;
                ChatComposePanelNew.this.m75559W();
                ChatComposePanelNew.this.m75598e0();
                if (ChatComposePanelNew.this.f69001B != null) {
                    ChatComposePanelNew.this.f69001B.mo64278v(z11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l(ChatComposePanelNew.f68999U).mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: e */
        public void mo45281e() {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64261e();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: g */
        public void mo45282g() {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64263g();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: h */
        public void mo45283h() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: i */
        public void mo45284i(C31890dc c31890dc) {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: j */
        public void mo45285j() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: k */
        public void mo45286k(Bundle bundle) {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: l */
        public void mo45287l() {
            ChatComposePanelNew.this.m75561b0();
            ChatComposePanelNew.this.bringToFront();
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64275s();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: m */
        public void mo45288m() {
            boolean z11 = ChatComposePanelNew.this.f69027z;
            ChatComposePanelNew.this.f69027z = false;
            ChatComposePanelNew.this.m75559W();
            ChatComposePanelNew chatComposePanelNew = ChatComposePanelNew.this;
            chatComposePanelNew.m75597d0(chatComposePanelNew.f69022u.m71290wM(), ChatComposePanelNew.this.f69022u.m71225Od());
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64279w(z11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: n */
        public void mo45289n() {
            ChatComposePanelNew.this.m75561b0();
            ChatComposePanelNew.this.f69027z = true;
            ChatComposePanelNew chatComposePanelNew = ChatComposePanelNew.this;
            chatComposePanelNew.m75597d0(chatComposePanelNew.f69022u.m71290wM(), ChatComposePanelNew.this.f69022u.m71225Od());
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64280x();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: o */
        public void mo45290o() {
            ChatComposePanelNew.this.m75559W();
            ChatComposePanelNew chatComposePanelNew = ChatComposePanelNew.this;
            chatComposePanelNew.m75597d0(chatComposePanelNew.f69022u.m71290wM(), ChatComposePanelNew.this.f69022u.m71225Od());
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64282z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$c */
    /* loaded from: classes6.dex */
    public class C13474c implements QuickPickerView.InterfaceC12655q {
        C13474c() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12655q
        /* renamed from: a */
        public void mo71299a(List list) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64281y(list);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12655q
        /* renamed from: b */
        public void mo71300b(boolean z11) {
            if (ChatComposePanelNew.this.f69000A != null) {
                ChatComposePanelNew.this.f69000A.setCbHQChecked(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$d */
    /* loaded from: classes6.dex */
    public class C13475d implements QuickPickerView.InterfaceC12658t {
        C13475d() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12658t
        /* renamed from: f */
        public void mo71319f(int i11) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64262f(i11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12658t
        /* renamed from: q */
        public void mo71320q() {
            ChatComposePanelNew.this.bringToFront();
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64273q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$e */
    /* loaded from: classes6.dex */
    public class C13476e implements QuickPickerView.InterfaceC12659u {
        C13476e() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: O */
        public void mo45270O(MediaItem mediaItem) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64255O(mediaItem);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: m */
        public void mo45271m(List list) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64269m(list);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: n */
        public void mo45272n(boolean z11, boolean z12) {
            ChatComposePanelNew.this.m75597d0(z11, z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$f */
    /* loaded from: classes6.dex */
    public class C13477f implements QuickPickerView.InterfaceC12657s {
        C13477f() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: Z */
        public void mo45273Z(C27373c c27373c, String str) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64256Z(c27373c, str);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: a */
        public void mo45274a() {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64276t();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: b */
        public boolean mo45275b() {
            return false;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: c */
        public void mo45276c(int i11) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64276t();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: d */
        public void mo45277d() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: e */
        public void mo45278e(List list, boolean z11) {
            ChatComposePanelNew.this.m75586P(list, true, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$g */
    /* loaded from: classes6.dex */
    public class C13478g implements QuickPickerView.InterfaceC12656r {
        C13478g() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12656r
        /* renamed from: o */
        public void mo71318o() {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64271o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$h */
    /* loaded from: classes6.dex */
    public class C13479h implements QuickPickerView.InterfaceC12662x {
        C13479h() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: a */
        public void mo71336a() {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64257a();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: b */
        public void mo71337b(C3251l c3251l, int i11) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64258b(c3251l, i11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: c */
        public void mo71338c(C3251l c3251l) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64259c(c3251l);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: d */
        public void mo71339d(C3251l c3251l, int i11) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64260d(c3251l, i11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: h */
        public void mo71340h(C3251l c3251l, int i11, int i12, int i13, String str) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64264h(c3251l, i11, i12, i13, str);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: j */
        public void mo71341j(C3251l c3251l, int i11, int i12, int i13, String str) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64266j(c3251l, i11, i12, i13, str);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: k */
        public void mo71342k(String str) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64267k(str);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: l */
        public void mo71343l(C3251l c3251l, C2522b c2522b) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64268l(c3251l, c2522b);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: n */
        public boolean mo71344n() {
            if (ChatComposePanelNew.this.f69001B != null && ChatComposePanelNew.this.f69001B.mo64270n()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12662x
        /* renamed from: p */
        public void mo71345p(String str) {
            if (ChatComposePanelNew.this.f69001B != null) {
                ChatComposePanelNew.this.f69001B.mo64272p(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$i */
    /* loaded from: classes6.dex */
    public class C13480i extends C19406k {
        C13480i() {
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: f */
        public void mo60355f(boolean z11) {
            super.mo60355f(z11);
            if (z11) {
                ChatComposePanelNew.this.m75598e0();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ChatComposePanelNew$j */
    /* loaded from: classes6.dex */
    public interface InterfaceC13481j {
        /* renamed from: K */
        void mo64254K(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData);

        /* renamed from: O */
        void mo64255O(MediaItem mediaItem);

        /* renamed from: Z */
        void mo64256Z(C27373c c27373c, String str);

        /* renamed from: a */
        void mo64257a();

        /* renamed from: b */
        void mo64258b(C3251l c3251l, int i11);

        /* renamed from: c */
        void mo64259c(C3251l c3251l);

        /* renamed from: d */
        void mo64260d(C3251l c3251l, int i11);

        /* renamed from: e */
        void mo64261e();

        /* renamed from: f */
        void mo64262f(int i11);

        /* renamed from: g */
        void mo64263g();

        C11598e.e getCurrMyCloudChatMode();

        /* renamed from: h */
        void mo64264h(C3251l c3251l, int i11, int i12, int i13, String str);

        /* renamed from: i */
        void mo64265i(int i11, C20564a c20564a);

        /* renamed from: j */
        void mo64266j(C3251l c3251l, int i11, int i12, int i13, String str);

        /* renamed from: k */
        void mo64267k(String str);

        /* renamed from: l */
        void mo64268l(C3251l c3251l, C2522b c2522b);

        /* renamed from: m */
        void mo64269m(List list);

        /* renamed from: n */
        boolean mo64270n();

        /* renamed from: o */
        void mo64271o();

        /* renamed from: p */
        void mo64272p(String str);

        /* renamed from: q */
        void mo64273q();

        /* renamed from: r */
        void mo64274r(int i11);

        /* renamed from: s */
        void mo64275s();

        /* renamed from: t */
        void mo64276t();

        /* renamed from: u */
        void mo64277u(List list, int i11, boolean z11, boolean z12);

        /* renamed from: v */
        void mo64278v(boolean z11);

        /* renamed from: w */
        void mo64279w(boolean z11);

        /* renamed from: x */
        void mo64280x();

        /* renamed from: y */
        void mo64281y(List list);

        /* renamed from: z */
        void mo64282z();
    }

    public ChatComposePanelNew(Context context, ChatInputBar chatInputBar, C13306b c13306b) {
        super(context);
        this.f69020s = 0;
        this.f69021t = -1;
        this.f69025x = false;
        this.f69027z = false;
        this.f69002C = new Handler(Looper.getMainLooper());
        this.f69003D = false;
        this.f69004E = new RunnableC13472a();
        this.f69005F = 0;
        this.f69006G = null;
        this.f69007H = "";
        this.f69008I = 0;
        this.f69010K = false;
        this.f69011L = new C13474c();
        this.f69012M = new C13475d();
        this.f69013N = new C13476e();
        this.f69014O = new C13477f();
        this.f69015P = new C13478g();
        this.f69016Q = new C13479h();
        this.f69017R = 0;
        this.f69018S = -1;
        this.f69019T = new C13480i();
        this.f69000A = chatInputBar;
        this.f69009J = c13306b;
    }

    /* renamed from: K */
    public /* synthetic */ void m75557K() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71289vO();
        }
    }

    /* renamed from: L */
    public /* synthetic */ void m75558L(int i11, C20564a c20564a) {
        InterfaceC13481j interfaceC13481j = this.f69001B;
        if (interfaceC13481j != null) {
            interfaceC13481j.mo64265i(i11, c20564a);
        }
    }

    /* renamed from: W */
    public void m75559W() {
        if (C11891a.m66068n0() && !this.f69027z) {
            C11891a.m66067m0(null).m66074r0();
        }
    }

    /* renamed from: a0 */
    public void m75560a0() {
        int i11 = this.f69020s;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                this.f69022u.m71205AM(this.f69017R);
                                this.f69022u.m71286uO(this.f69017R + getCachedKeyboardHeight());
                            } else {
                                throw new IllegalArgumentException("Invalid state input: " + this.f69003D);
                            }
                        } else {
                            this.f69022u.m71205AM(0);
                            this.f69022u.m71282qO(this.f69006G, this.f69007H, this.f69008I, getCurrMyCloudChatMode());
                        }
                    } else {
                        this.f69022u.m71205AM(0);
                        this.f69022u.m71285tO();
                    }
                } else {
                    this.f69022u.m71205AM(0);
                    this.f69022u.m71279oO(this.f69003D, new SensitiveData("gallery_csc_input", "comm_csc"));
                    this.f69022u.m71241UN(this.f69010K);
                }
            } else {
                this.f69022u.m71205AM(this.f69005F);
                this.f69022u.m71283rO();
            }
        } else {
            this.f69022u.m71292xM();
            this.f69022u.m71205AM(0);
            this.f69027z = false;
        }
        InterfaceC13481j interfaceC13481j = this.f69001B;
        if (interfaceC13481j != null) {
            interfaceC13481j.mo64274r(this.f69020s);
        }
    }

    /* renamed from: b0 */
    public void m75561b0() {
        if (C11891a.m66068n0()) {
            C11891a.m66067m0(null).m66075s0();
        }
    }

    /* renamed from: A */
    public boolean m75573A() {
        return this.f69020s == 0;
    }

    /* renamed from: B */
    public boolean m75574B() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.m71255ZM()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m75575C() {
        return this.f69027z;
    }

    /* renamed from: D */
    public boolean m75576D() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.m71233SM()) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean m75577E() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.m71251YM()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean m75578F() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.m92674mJ() && this.f69022u.m71254ZL() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public boolean m75579G() {
        return this.f69000A != null && this.f69020s == 3;
    }

    /* renamed from: H */
    public boolean m75580H() {
        return this.f69000A != null && this.f69020s == 4;
    }

    /* renamed from: I */
    public boolean m75581I() {
        return this.f69000A != null && this.f69020s == 2;
    }

    /* renamed from: J */
    public boolean m75582J() {
        return this.f69000A != null && this.f69020s == 1;
    }

    /* renamed from: M */
    public void m75583M(int i11) {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71288vN(i11);
        }
    }

    /* renamed from: N */
    public void m75584N(InterfaceC0887b interfaceC0887b) {
        if (interfaceC0887b == null) {
            return;
        }
        this.f69022u.m71293xN(interfaceC0887b);
    }

    /* renamed from: O */
    public void m75585O(int i11, int i12, Intent intent) {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.onActivityResult(i11, i12, intent);
        }
    }

    /* renamed from: P */
    public void m75586P(List list, boolean z11, boolean z12) {
        QuickPickerView quickPickerView;
        try {
            if (this.f69001B != null && (quickPickerView = this.f69022u) != null) {
                this.f69001B.mo64277u(list, quickPickerView.m71272iM(), z11, z12);
                this.f69022u.m71218KN();
                this.f69022u.m71207DO();
                this.f69022u.m71266eO(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Q */
    public void m75587Q() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71296zN();
        }
    }

    /* renamed from: R */
    public boolean m75588R(int i11) {
        return false;
    }

    /* renamed from: S */
    public void m75589S() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            List m71230RL = quickPickerView.m71230RL();
            if (m71230RL.isEmpty()) {
                C24559a.m127933c(f68999U, "onSendPhotos: clone 0 items");
            }
            m75586P(m71230RL, false, false);
        }
    }

    /* renamed from: T */
    public void m75590T() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71213HM(this.f69006G, this.f69007H, this.f69008I, getCurrMyCloudChatMode());
        }
    }

    /* renamed from: U */
    public void m75591U(List list) {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71250Xv(list);
        }
    }

    /* renamed from: V */
    public void m75592V() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71262bd();
        }
    }

    /* renamed from: X */
    public void m75593X(int i11, boolean z11) {
        m75594Y(i11, z11, false);
    }

    /* renamed from: Y */
    public void m75594Y(int i11, boolean z11, boolean z12) {
        try {
            this.f69002C.removeCallbacks(this.f69004E);
            this.f69020s = i11;
            this.f69003D = z11;
            this.f69010K = z12;
            QuickPickerView quickPickerView = this.f69022u;
            if (quickPickerView != null && quickPickerView.m92674mJ() && this.f69022u.m92656bJ() != null) {
                m75560a0();
            } else {
                this.f69002C.postDelayed(this.f69004E, 100L);
            }
            m75598e0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f68999U, e11);
        }
    }

    /* renamed from: Z */
    public void m75595Z(int i11, int i12) {
        this.f69017R = i11;
        this.f69018S = i12;
    }

    /* renamed from: c0 */
    public void m75596c0() {
    }

    /* renamed from: d0 */
    public void m75597d0(boolean z11, boolean z12) {
        QuickPickerView quickPickerView;
        if (this.f69000A != null && (quickPickerView = this.f69022u) != null && quickPickerView.m71246WM()) {
            this.f69000A.m65399Q(z11, z12);
        }
    }

    /* renamed from: e0 */
    public void m75598e0() {
        m75599f0(-1);
    }

    /* renamed from: f0 */
    public void m75599f0(int i11) {
        int i12;
        if (this.f69000A != null) {
            QuickPickerView quickPickerView = this.f69022u;
            if (quickPickerView != null) {
                i12 = quickPickerView.m71254ZL();
            } else {
                i12 = -2;
            }
            this.f69000A.m65400R(i12, i11);
        }
    }

    /* renamed from: g0 */
    public void m75600g0(int i11) {
        this.f69005F = i11;
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71256ZN(i11);
        }
    }

    public View getBtnStickerStoreViewInPanel() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView == null) {
            return null;
        }
        return quickPickerView.m71248XL();
    }

    public int getCachedKeyboardHeight() {
        if (this.f69018S == -1) {
            this.f69018S = AbstractC23309i.m122007i5(getContext());
        }
        return this.f69018S;
    }

    public C11598e.e getCurrMyCloudChatMode() {
        InterfaceC13481j interfaceC13481j = this.f69001B;
        if (interfaceC13481j != null) {
            return interfaceC13481j.getCurrMyCloudChatMode();
        }
        return null;
    }

    public View getDisplayingStickerCateMoreViewInPanel() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView == null) {
            return null;
        }
        return quickPickerView.m71257aM();
    }

    public View getEmojiIndicatorViewInPanel() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView == null) {
            return null;
        }
        return quickPickerView.m71260bM();
    }

    public int getMode() {
        return this.f69020s;
    }

    public QuickPickerView getQuickPickerView() {
        return this.f69022u;
    }

    public View getSearchGifIndicatorViewInPanel() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView == null) {
            return null;
        }
        return quickPickerView.m71275mM();
    }

    public Conversation getSendToConversation() {
        return this.f69026y;
    }

    /* renamed from: h0 */
    public void m75601h0(boolean z11) {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.m71246WM()) {
            this.f69022u.m71215IO(z11);
        }
    }

    /* renamed from: i0 */
    public void m75602i0() {
        try {
            QuickPickerView quickPickerView = this.f69022u;
            if (quickPickerView != null) {
                quickPickerView.m71214HO();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f68999U, e11);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        try {
            QuickPickerView quickPickerView = this.f69022u;
            if (quickPickerView != null) {
                return quickPickerView.onKeyUp(i11, keyEvent);
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104543l(f68999U).mo104552e(e11);
            return false;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f69021t = savedState.f69028p;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f69028p = this.f69021t;
        return savedState;
    }

    /* renamed from: q */
    public boolean m75603q() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            return quickPickerView.m71226PL();
        }
        return true;
    }

    /* renamed from: r */
    public void m75604r(String str, boolean z11) {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71210GG(str, z11);
        }
    }

    /* renamed from: s */
    public void m75605s(List list) {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71232S4(list);
        }
    }

    public void setAttachmentIdHighLight(int i11) {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null) {
            quickPickerView.m71259b7(i11);
        }
    }

    public void setGroup(boolean z11) {
        this.f69024w = z11;
    }

    public void setIsCommunity(boolean z11) {
        this.f69025x = z11;
    }

    public void setListener(InterfaceC13481j interfaceC13481j) {
        this.f69001B = interfaceC13481j;
    }

    public void setMode(int i11) {
        m75594Y(i11, false, false);
    }

    public void setSendToConversation(Conversation conversation) {
        this.f69026y = conversation;
    }

    public void setStrSendTo(String str) {
        this.f69023v = str;
    }

    public void setZinstantOAListener(InterfaceC19397b interfaceC19397b) {
        this.f69019T.m101523k(interfaceC19397b);
    }

    /* renamed from: u */
    public void m75606u(List list) {
        try {
            QuickPickerView quickPickerView = this.f69022u;
            if (quickPickerView != null) {
                quickPickerView.m71280oq(list);
                m75598e0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: v */
    public void m75607v(int i11) {
        try {
            QuickPickerView quickPickerView = this.f69022u;
            if (quickPickerView != null) {
                quickPickerView.m71265dO(false);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.zing.zalo.ui.widget.e
                    public /* synthetic */ RunnableC13618e() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatComposePanelNew.this.m75557K();
                    }
                }, i11);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l(f68999U).mo104552e(e11);
        }
    }

    /* renamed from: w */
    public void m75608w(C17487o0 c17487o0, boolean z11, QuickPickerView.InterfaceC12664z interfaceC12664z, EnumC18030a enumC18030a, String str, int i11, boolean z12, int i12, boolean z13) {
        try {
            this.f69005F = i12;
            if (this.f69022u == null) {
                if (z11) {
                    ZaloView m92996E0 = c17487o0.m92996E0("QuickPickerView");
                    if (m92996E0 instanceof QuickPickerView) {
                        this.f69022u = (QuickPickerView) m92996E0;
                    }
                }
                if (this.f69022u == null) {
                    try {
                        this.f69022u = new QuickPickerView(this.f69009J);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("extra_media_picker_source", EnumC22962a.f111694r);
                        bundle.putBoolean("extra_enable_inline_banner", true);
                        bundle.putParcelable("extra_chat_uid_to", this.f69026y);
                        bundle.putString("extra_chat_str_send_to", this.f69023v);
                        bundle.putBoolean("extra_is_group", this.f69024w);
                        bundle.putInt("extra_sticker_panel_height", i12);
                        bundle.putBoolean("EXTRA_IS_COMMUNITY", this.f69025x);
                        this.f69022u.mo60305zK(bundle);
                        c17487o0.m93058d2(getId(), this.f69022u, 0, "QuickPickerView", 0, false);
                    } catch (Exception e11) {
                        AbstractC20110a.m104543l(f68999U).mo104552e(e11);
                        this.f69022u = null;
                    }
                }
                QuickPickerView quickPickerView = this.f69022u;
                if (quickPickerView != null) {
                    quickPickerView.m71261bO(new C13473b());
                    this.f69022u.m71238TN(this.f69011L);
                    this.f69022u.m71249XN(this.f69012M);
                    this.f69022u.m71252YN(this.f69013N);
                    this.f69022u.m71247WN(this.f69014O);
                    this.f69022u.m71244VN(this.f69015P);
                    this.f69022u.m71258aO(this.f69016Q);
                    this.f69022u.m71228QN(new QuickPickerView.InterfaceC12661w() { // from class: com.zing.zalo.ui.widget.d
                        public /* synthetic */ C13609d() {
                        }

                        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12661w
                        /* renamed from: i */
                        public final void mo71335i(int i13, C20564a c20564a) {
                            ChatComposePanelNew.this.m75558L(i13, c20564a);
                        }
                    });
                    this.f69022u.m71264cO(interfaceC12664z);
                    this.f69022u.m71268gO(this.f69019T);
                } else {
                    throw new IllegalArgumentException("Cannot initialize quick picker");
                }
            }
            this.f69022u.m71239UL(z12);
            this.f69022u.m71236TL(z13);
            this.f69022u.m71212GO(1);
            this.f69006G = enumC18030a;
            this.f69007H = str;
            this.f69008I = i11;
        } catch (Exception e12) {
            AbstractC20110a.m104543l(f68999U).mo104552e(e12);
        }
    }

    /* renamed from: x */
    public boolean m75609x() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.m71253Yg()) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public boolean m75610y() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.m71225Od()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m75611z() {
        QuickPickerView quickPickerView = this.f69022u;
        if (quickPickerView != null && quickPickerView.f65908G0) {
            return true;
        }
        return false;
    }
}
