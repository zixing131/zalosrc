package com.zing.zalo.p077ui.chat.picker.file;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23202r9;
import me0.AbstractC23204s0;
import me0.AbstractC23254w8;
import me0.AbstractC23262x6;
import ml.C23343a;
import p239ih.C20556f;
import p269jj.C21275a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import sj.C26275a;
import su.C26388b;
import zc0.C31784b;

/* loaded from: classes5.dex */
public class FileSelectView extends SlidableZaloView implements InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: z1 */
    public static long f60686z1 = AbstractC23309i.m121231Nd() * ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;

    /* renamed from: P0 */
    private RecyclerView f60687P0;

    /* renamed from: Q0 */
    private FileSelectAdapter f60688Q0;

    /* renamed from: V0 */
    private String f60693V0;

    /* renamed from: W0 */
    private ArrayList f60694W0;

    /* renamed from: X0 */
    private ArrayList f60695X0;

    /* renamed from: Z0 */
    private MultiStateView f60697Z0;

    /* renamed from: a1 */
    private LinearLayoutManager f60698a1;

    /* renamed from: b1 */
    private EditText f60699b1;

    /* renamed from: c1 */
    private View f60700c1;

    /* renamed from: d1 */
    private RobotoTextView f60701d1;

    /* renamed from: e1 */
    private ActionBarMenuItem f60702e1;

    /* renamed from: h1 */
    private Map f60705h1;

    /* renamed from: i1 */
    private Map f60706i1;

    /* renamed from: j1 */
    private RunnableC11670e f60707j1;

    /* renamed from: m1 */
    private C11672g f60710m1;

    /* renamed from: n1 */
    private View f60711n1;

    /* renamed from: o1 */
    private C11671f f60712o1;

    /* renamed from: p1 */
    private ContentObserver f60713p1;

    /* renamed from: R0 */
    private String f60689R0 = "ROOT_PATH";

    /* renamed from: S0 */
    private final ArrayList f60690S0 = new ArrayList();

    /* renamed from: T0 */
    private final ArrayList f60691T0 = new ArrayList();

    /* renamed from: U0 */
    private String f60692U0 = "";

    /* renamed from: Y0 */
    private boolean f60696Y0 = false;

    /* renamed from: f1 */
    private int f60703f1 = 0;

    /* renamed from: g1 */
    private long f60704g1 = 0;

    /* renamed from: k1 */
    private boolean f60708k1 = false;

    /* renamed from: l1 */
    private boolean f60709l1 = false;

    /* renamed from: q1 */
    private boolean f60714q1 = false;

    /* renamed from: r1 */
    private boolean f60715r1 = false;

    /* renamed from: s1 */
    private boolean f60716s1 = false;

    /* renamed from: t1 */
    private final C21275a f60717t1 = AbstractC23306f.m120583H();

    /* renamed from: u1 */
    ActionBarMenuItem.C17435d f60718u1 = new C11669d();

    /* renamed from: v1 */
    private final Comparator f60719v1 = new Comparator() { // from class: f60.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m65028fN;
            m65028fN = FileSelectView.m65028fN((FileSelectView.C11672g) obj, (FileSelectView.C11672g) obj2);
            return m65028fN;
        }
    };

    /* renamed from: w1 */
    private final Comparator f60720w1 = new Comparator() { // from class: f60.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m65030gN;
            m65030gN = FileSelectView.m65030gN((FileSelectView.C11674i) obj, (FileSelectView.C11674i) obj2);
            return m65030gN;
        }
    };

    /* renamed from: x1 */
    private final Comparator f60721x1 = new Comparator() { // from class: f60.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m65032hN;
            m65032hN = FileSelectView.m65032hN((FileSelectView.C11672g) obj, (FileSelectView.C11672g) obj2);
            return m65032hN;
        }
    };

    /* renamed from: y1 */
    private final Comparator f60722y1 = new Comparator() { // from class: f60.i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m65027eN;
            m65027eN = FileSelectView.m65027eN((FileSelectView.C11674i) obj, (FileSelectView.C11674i) obj2);
            return m65027eN;
        }
    };

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$a */
    /* loaded from: classes5.dex */
    class C11666a extends ContentObserver {
        C11666a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            super.onChange(z11);
            FileSelectView.this.m65062wN();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$b */
    /* loaded from: classes5.dex */
    class C11667b extends RecyclerView.AbstractC1892s {
        C11667b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                FileSelectView.this.f60688Q0.f60608u = false;
                FileSelectView.this.f60688Q0.m10008p();
            } else {
                if (FileSelectView.this.f60699b1 != null) {
                    AbstractC2379w.m12430d(FileSelectView.this.f60699b1);
                }
                FileSelectView.this.f60688Q0.f60608u = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$c */
    /* loaded from: classes5.dex */
    public class C11668c implements InterfaceC11673h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$c$a */
        /* loaded from: classes5.dex */
        public class a implements Animator.AnimatorListener {
            a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                FileSelectView.this.f60715r1 = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                FileSelectView.this.f60715r1 = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$c$b */
        /* loaded from: classes5.dex */
        public class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (FileSelectView.this.f60700c1 != null && FileSelectView.this.f60708k1) {
                    FileSelectView.this.f60700c1.setVisibility(0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$c$c */
        /* loaded from: classes5.dex */
        public class c extends AnimatorListenerAdapter {
            c() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (FileSelectView.this.f60700c1 != null && !FileSelectView.this.f60708k1) {
                    FileSelectView.this.f60700c1.setVisibility(8);
                }
            }
        }

        C11668c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m65070h() {
            int i11;
            String str;
            if (FileSelectView.this.mo60294yp()) {
                return;
            }
            if (FileSelectView.this.f60699b1 != null) {
                AbstractC2379w.m12430d(FileSelectView.this.f60699b1);
                if (FileSelectView.this.f60709l1) {
                    if (FileSelectView.this.f60699b1.getText() == null) {
                        str = "";
                    } else {
                        str = FileSelectView.this.f60699b1.getText().toString();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        FileSelectView.this.f60699b1.setText("");
                    }
                    ((ZaloView) FileSelectView.this).f88763d0.m92751s();
                }
            }
            FileSelectView.this.f60688Q0.m64974U(FileSelectView.this.f60690S0, true);
            FileSelectView.this.f60688Q0.m10008p();
            FileSelectView.this.f60701d1.setText((FileSelectView.this.f60694W0.size() + FileSelectView.this.f60695X0.size()) + " (" + AbstractC23041d2.m118214m(Locale.ROOT, FileSelectView.this.f60704g1) + ") ");
            int i12 = 0;
            if (FileSelectView.this.f60712o1 == null) {
                FileSelectView.this.f60715r1 = false;
                return;
            }
            if (!FileSelectView.this.f60691T0.contains(FileSelectView.this.f60712o1)) {
                i12 = FileSelectView.this.f60712o1.f60735a;
                i11 = FileSelectView.this.f60712o1.f60736b;
            } else {
                i11 = 0;
            }
            FileSelectView.this.f60698a1.m9721B2(i12, i11);
            AbstractC23202r9.m119540h(FileSelectView.this.f60687P0, new a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m65071i(int i11) {
            View mo9732P;
            if (FileSelectView.this.mo60294yp()) {
                return;
            }
            FileSelectView.this.f60701d1.setText((FileSelectView.this.f60694W0.size() + FileSelectView.this.f60695X0.size()) + " (" + AbstractC23041d2.m118214m(Locale.ROOT, FileSelectView.this.f60704g1) + ") ");
            FileSelectView.this.f60688Q0.m10010r(i11, 0);
            if (!FileSelectView.this.f60708k1) {
                if (FileSelectView.this.f60694W0.size() > 0 || FileSelectView.this.f60695X0.size() > 0) {
                    FileSelectView.this.f60708k1 = true;
                    FileSelectView.this.f60690S0.add(FileSelectView.this.f60710m1);
                    FileSelectView.this.f60688Q0.m64968O().add(FileSelectView.this.f60710m1);
                    FileSelectView.this.f60688Q0.m10011s(FileSelectView.this.f60688Q0.mo10003k() - 1);
                    if (i11 == FileSelectView.this.f60688Q0.mo10003k() - 2 && (mo9732P = FileSelectView.this.f60698a1.mo9732P(i11)) != null) {
                        FileSelectView.this.f60687P0.m9845O1(0, (int) ((mo9732P.getHeight() - (FileSelectView.this.f60687P0.getHeight() - mo9732P.getY())) + FileSelectAdapter.FakeBottomView.f60633K));
                    }
                    AbstractC23202r9.m119538f(FileSelectView.this.f60700c1, FileSelectAdapter.FakeBottomView.f60633K, new b());
                }
            } else if (FileSelectView.this.f60694W0.size() == 0 && FileSelectView.this.f60695X0.size() == 0) {
                FileSelectView.this.f60708k1 = false;
                FileSelectView.this.f60690S0.remove(FileSelectView.this.f60710m1);
                FileSelectView.this.f60688Q0.m64968O().remove(FileSelectView.this.f60710m1);
                FileSelectView.this.f60688Q0.m10017y(FileSelectView.this.f60688Q0.mo10003k());
                AbstractC23202r9.m119544l(FileSelectView.this.f60700c1, FileSelectAdapter.FakeBottomView.f60633K, new c());
            }
            FileSelectView.this.f60715r1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m65072j(int i11) {
            if (FileSelectView.this.mo60294yp()) {
                return;
            }
            FileSelectView.this.f60688Q0.m64968O().remove(i11);
            FileSelectView.this.f60688Q0.m10017y(i11);
        }

        @Override // com.zing.zalo.p077ui.chat.picker.file.FileSelectView.InterfaceC11673h
        /* renamed from: a */
        public void mo65073a() {
            ((CommonZaloview) FileSelectView.this).f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.chat.picker.file.d
                @Override // java.lang.Runnable
                public final void run() {
                    FileSelectView.C11668c.this.m65070h();
                }
            });
        }

        @Override // com.zing.zalo.p077ui.chat.picker.file.FileSelectView.InterfaceC11673h
        /* renamed from: b */
        public void mo65074b(String str) {
            if (FileSelectView.this.mo60294yp()) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
            FileSelectView.this.f60715r1 = false;
        }

        @Override // com.zing.zalo.p077ui.chat.picker.file.FileSelectView.InterfaceC11673h
        /* renamed from: c */
        public void mo65075c(final int i11, String str) {
            if (FileSelectView.this.mo60294yp()) {
                return;
            }
            if (i11 >= 0 && i11 < FileSelectView.this.f60688Q0.mo10003k()) {
                if (!FileSelectView.this.f60709l1) {
                    FileSelectView.this.f60690S0.remove(i11);
                } else {
                    C11672g m64969P = FileSelectView.this.f60688Q0.m64969P(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= FileSelectView.this.f60690S0.size()) {
                            break;
                        }
                        if (((C11672g) FileSelectView.this.f60690S0.get(i12)).f60744g.equals(m64969P.f60744g)) {
                            FileSelectView.this.f60690S0.remove(i12);
                            break;
                        }
                        i12++;
                    }
                }
                ((CommonZaloview) FileSelectView.this).f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.chat.picker.file.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileSelectView.C11668c.this.m65072j(i11);
                    }
                });
            }
            mo65074b(str);
        }

        @Override // com.zing.zalo.p077ui.chat.picker.file.FileSelectView.InterfaceC11673h
        /* renamed from: d */
        public void mo65076d(final int i11) {
            ((CommonZaloview) FileSelectView.this).f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.chat.picker.file.b
                @Override // java.lang.Runnable
                public final void run() {
                    FileSelectView.C11668c.this.m65071i(i11);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$d */
    /* loaded from: classes5.dex */
    class C11669d extends ActionBarMenuItem.C17435d {
        C11669d() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: c */
        public void mo65077c() {
            super.mo65077c();
            FileSelectView.this.f60709l1 = false;
            FileSelectView.this.f60702e1.setVisibility(0);
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: d */
        public void mo65078d() {
            super.mo65078d();
            FileSelectView.this.f60709l1 = true;
            FileSelectView.this.f60702e1.setVisibility(8);
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            int i11;
            if (!FileSelectView.this.f60714q1) {
                new C11675j(editText.getText().toString());
                if (FileSelectView.this.f60711n1 != null) {
                    View view = FileSelectView.this.f60711n1;
                    if (TextUtils.isEmpty(editText.getText().toString())) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    view.setVisibility(i11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$e */
    /* loaded from: classes5.dex */
    public class RunnableC11670e implements Runnable {

        /* renamed from: p */
        private final InterfaceC11673h f60730p;

        /* renamed from: q */
        private int f60731q;

        /* renamed from: r */
        private String f60732r;

        /* renamed from: s */
        private int f60733s;

        RunnableC11670e(InterfaceC11673h interfaceC11673h) {
            this.f60730p = interfaceC11673h;
        }

        /* renamed from: a */
        public RunnableC11670e m65080a(int i11, String str, int i12) {
            this.f60731q = i11;
            this.f60732r = str;
            this.f60733s = i12;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0245 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #0 {Exception -> 0x0055, blocks: (B:2:0x0000, B:8:0x000a, B:10:0x000e, B:13:0x001c, B:15:0x002d, B:17:0x0034, B:19:0x0041, B:21:0x0058, B:23:0x0060, B:25:0x0072, B:29:0x007c, B:31:0x009e, B:33:0x00ba, B:35:0x00dc, B:37:0x00fc, B:39:0x011c, B:41:0x0123, B:43:0x012a, B:51:0x0154, B:53:0x0161, B:55:0x0167, B:57:0x0185, B:59:0x018b, B:61:0x0190, B:63:0x019c, B:65:0x01b2, B:68:0x01c9, B:70:0x01cd, B:72:0x01d9, B:74:0x01ef, B:76:0x01fa, B:78:0x020a, B:80:0x0225, B:82:0x023a, B:84:0x0245, B:86:0x013b, B:89:0x0145), top: B:1:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            char c11;
            int i11;
            try {
                int i12 = this.f60731q;
                if (i12 != 0) {
                    if (i12 == 1) {
                        int i13 = this.f60733s;
                        if (i13 >= 0 && i13 < FileSelectView.this.f60688Q0.mo10003k()) {
                            C11672g m64969P = FileSelectView.this.f60688Q0.m64969P(this.f60733s);
                            if (m64969P.f60738a != 5) {
                                FileSelectView.this.f60715r1 = false;
                                return;
                            }
                            boolean z11 = !m64969P.f60755r;
                            m64969P.f60755r = z11;
                            if (z11) {
                                if (!new File(m64969P.f60744g).exists()) {
                                    m64969P.f60755r = !m64969P.f60755r;
                                    this.f60730p.mo65075c(this.f60733s, AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_open_file_not_exist));
                                    return;
                                }
                                long j11 = m64969P.f60746i;
                                if (j11 == 0) {
                                    m64969P.f60755r = !m64969P.f60755r;
                                    this.f60730p.mo65074b(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_pick_empty_file));
                                    return;
                                }
                                long j12 = FileSelectView.f60686z1;
                                if (j12 != 0 && j11 > j12) {
                                    m64969P.f60755r = !m64969P.f60755r;
                                    this.f60730p.mo65074b(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_upload_file_limit), AbstractC23041d2.m118214m(Locale.ROOT, FileSelectView.f60686z1)));
                                    return;
                                } else if (FileSelectView.this.f60695X0.size() + FileSelectView.this.f60694W0.size() + 1 > AbstractC23309i.m121336Q7()) {
                                    m64969P.f60755r = !m64969P.f60755r;
                                    this.f60730p.mo65074b(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_select_file_reach_limit), Integer.valueOf(AbstractC23309i.m121336Q7())));
                                    return;
                                } else {
                                    FileSelectView.this.f60694W0.add(m64969P.f60744g);
                                    FileSelectView.this.f60704g1 += m64969P.f60746i;
                                    this.f60730p.mo65076d(this.f60733s);
                                    return;
                                }
                            }
                            FileSelectView.this.f60694W0.remove(m64969P.f60744g);
                            FileSelectView.this.f60704g1 -= m64969P.f60746i;
                            this.f60730p.mo65076d(this.f60733s);
                            return;
                        }
                        FileSelectView.this.f60715r1 = false;
                        return;
                    }
                    return;
                }
                String str = this.f60732r;
                int hashCode = str.hashCode();
                if (hashCode != 413624790) {
                    if (hashCode == 1949030754 && str.equals("ROOT_PATH")) {
                        c11 = 0;
                        if (c11 != 0) {
                            FileSelectView.this.m65052rN();
                            this.f60730p.mo65073a();
                            return;
                        }
                        if (c11 == 1) {
                            FileSelectView.this.m65054sN();
                            this.f60730p.mo65073a();
                            return;
                        }
                        File file = new File(this.f60732r);
                        if (file.isDirectory()) {
                            if (!file.exists()) {
                                FileSelectView.this.f60691T0.remove(FileSelectView.this.f60712o1);
                                this.f60730p.mo65075c(this.f60733s, AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_folder_not_exist));
                                return;
                            }
                            if (file.list() != null && ((i11 = this.f60733s) < 0 || i11 >= FileSelectView.this.f60688Q0.mo10003k() || ((C11672g) FileSelectView.this.f60688Q0.m64968O().get(this.f60733s)).f60738a != 3 || ((C11672g) FileSelectView.this.f60688Q0.m64968O().get(this.f60733s)).f60748k != 0)) {
                                int i14 = this.f60733s;
                                if (i14 >= 0 && i14 < FileSelectView.this.f60688Q0.mo10003k() && ((C11672g) FileSelectView.this.f60688Q0.m64968O().get(this.f60733s)).f60738a == 3) {
                                    FileSelectView.this.m65050qN(file);
                                    this.f60730p.mo65073a();
                                    return;
                                } else {
                                    FileSelectView.this.f60691T0.remove(FileSelectView.this.f60712o1);
                                    return;
                                }
                            }
                            FileSelectView.this.f60691T0.remove(FileSelectView.this.f60712o1);
                            this.f60730p.mo65074b(AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_empty_folder));
                            return;
                        }
                        FileSelectView.this.f60691T0.remove(FileSelectView.this.f60712o1);
                        FileSelectView.this.f60715r1 = false;
                        return;
                    }
                    c11 = 65535;
                    if (c11 != 0) {
                    }
                } else {
                    if (str.equals("PHOTO_VIDEO_PATH")) {
                        c11 = 1;
                        if (c11 != 0) {
                        }
                    }
                    c11 = 65535;
                    if (c11 != 0) {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$f */
    /* loaded from: classes5.dex */
    public static class C11671f {

        /* renamed from: a */
        public int f60735a;

        /* renamed from: b */
        public int f60736b;

        /* renamed from: c */
        public String f60737c;

        private C11671f() {
            this.f60735a = 0;
            this.f60736b = 0;
            this.f60737c = "";
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$g */
    /* loaded from: classes5.dex */
    public static class C11672g {

        /* renamed from: a */
        public int f60738a = 5;

        /* renamed from: b */
        public int f60739b = 0;

        /* renamed from: c */
        public String f60740c = "";

        /* renamed from: d */
        public String f60741d = "";

        /* renamed from: e */
        public String f60742e = "";

        /* renamed from: f */
        public String f60743f = "";

        /* renamed from: g */
        public String f60744g = "";

        /* renamed from: h */
        public long f60745h = 0;

        /* renamed from: i */
        public long f60746i = 0;

        /* renamed from: j */
        public File f60747j = null;

        /* renamed from: k */
        public int f60748k = 0;

        /* renamed from: l */
        public ArrayList f60749l = new ArrayList();

        /* renamed from: m */
        public int f60750m = 0;

        /* renamed from: n */
        public int f60751n = 0;

        /* renamed from: o */
        public int f60752o = 0;

        /* renamed from: p */
        public String f60753p = "";

        /* renamed from: q */
        public int f60754q = 0;

        /* renamed from: r */
        public boolean f60755r = false;

        /* renamed from: a */
        public int m65081a() {
            return this.f60738a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$h */
    /* loaded from: classes5.dex */
    interface InterfaceC11673h {
        /* renamed from: a */
        void mo65073a();

        /* renamed from: b */
        void mo65074b(String str);

        /* renamed from: c */
        void mo65075c(int i11, String str);

        /* renamed from: d */
        void mo65076d(int i11);
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$i */
    /* loaded from: classes5.dex */
    public static class C11674i extends File {

        /* renamed from: p */
        public long f60756p;

        /* renamed from: q */
        public long f60757q;

        public C11674i(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectView$j */
    /* loaded from: classes5.dex */
    public class C11675j extends Thread {

        /* renamed from: p */
        final String f60758p;

        public C11675j(String str) {
            super("Z:FileSelect-Search");
            this.f60758p = str;
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m65083b(ArrayList arrayList) {
            if (FileSelectView.this.mo60294yp()) {
                return;
            }
            try {
                if (this.f60758p.equals(FileSelectView.this.f60699b1.getText().toString())) {
                    FileSelectView.this.f60688Q0.m64974U(arrayList, false);
                    FileSelectView.this.f60688Q0.m10008p();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String str;
            String str2;
            try {
                final ArrayList arrayList = new ArrayList();
                int i11 = 0;
                if (TextUtils.isEmpty(this.f60758p)) {
                    while (i11 < FileSelectView.this.f60690S0.size()) {
                        ((C11672g) FileSelectView.this.f60690S0.get(i11)).f60749l.clear();
                        i11++;
                    }
                    arrayList.addAll(FileSelectView.this.f60690S0);
                } else {
                    String m120002o = AbstractC23262x6.m120002o(this.f60758p);
                    if (FileSelectView.this.f60689R0.equals("PHOTO_VIDEO_PATH")) {
                        arrayList.add((C11672g) FileSelectView.this.f60690S0.get(0));
                        Iterator it = FileSelectView.this.f60706i1.values().iterator();
                        while (it.hasNext()) {
                            for (C11674i c11674i : (List) it.next()) {
                                String m120002o2 = AbstractC23262x6.m120002o(c11674i.getName());
                                if (!TextUtils.isEmpty(m120002o2) && m120002o2.contains(m120002o)) {
                                    C11672g c11672g = new C11672g();
                                    c11672g.f60740c = c11674i.getName();
                                    c11672g.f60747j = c11674i;
                                    c11672g.f60745h = c11674i.f60756p;
                                    c11672g.f60738a = 5;
                                    c11672g.f60744g = c11674i.getAbsolutePath();
                                    if (FileSelectView.this.f60705h1.containsKey(c11672g.f60744g)) {
                                        str = (String) FileSelectView.this.f60705h1.get(c11672g.f60744g);
                                    } else {
                                        str = c11672g.f60744g;
                                    }
                                    c11672g.f60743f = str;
                                    String[] split = c11674i.getName().split("\\.");
                                    if (split.length > 1) {
                                        str2 = split[split.length - 1];
                                    } else {
                                        str2 = "?";
                                    }
                                    c11672g.f60742e = str2;
                                    long j11 = c11674i.f60757q;
                                    c11672g.f60746i = j11;
                                    c11672g.f60741d = AbstractC23041d2.m118214m(Locale.ROOT, j11);
                                    c11672g.f60755r = FileSelectView.this.m65026dN(c11672g.f60744g);
                                    int indexOf = m120002o2.indexOf(m120002o);
                                    if (indexOf != -1) {
                                        int length = m120002o.length() + indexOf;
                                        c11672g.f60749l.add(Integer.valueOf(indexOf));
                                        c11672g.f60749l.add(Integer.valueOf(length));
                                    }
                                    arrayList.add(c11672g);
                                    i11 = 1;
                                }
                            }
                        }
                    } else {
                        Iterator it2 = FileSelectView.this.f60690S0.iterator();
                        while (it2.hasNext()) {
                            C11672g c11672g2 = (C11672g) it2.next();
                            c11672g2.f60749l.clear();
                            int i12 = c11672g2.f60738a;
                            if (i12 == 5) {
                                String m120002o3 = AbstractC23262x6.m120002o(c11672g2.f60740c);
                                if (!TextUtils.isEmpty(m120002o3) && m120002o3.contains(m120002o)) {
                                    int indexOf2 = m120002o3.indexOf(m120002o);
                                    if (indexOf2 != -1) {
                                        int length2 = m120002o.length() + indexOf2;
                                        c11672g2.f60749l.add(Integer.valueOf(indexOf2));
                                        c11672g2.f60749l.add(Integer.valueOf(length2));
                                    }
                                    arrayList.add(c11672g2);
                                    i11 = 1;
                                }
                            } else if (i12 != 3 && i12 != 4 && i12 != 7) {
                                arrayList.add(c11672g2);
                            }
                        }
                    }
                    if (i11 == 0) {
                        C11672g c11672g3 = new C11672g();
                        c11672g3.f60738a = 6;
                        arrayList.add(c11672g3);
                    } else if (FileSelectView.this.f60694W0.size() != 0 || FileSelectView.this.f60695X0.size() != 0) {
                        arrayList.add(FileSelectView.this.f60710m1);
                    }
                }
                if (FileSelectView.this.f72421L0.m92676n2() != null) {
                    FileSelectView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.chat.picker.file.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            FileSelectView.C11675j.this.m65083b(arrayList);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: aN */
    private void m65023aN(File file) {
        File[] listFiles;
        String str;
        String str2;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.isDirectory()) {
                    C11672g c11672g = new C11672g();
                    c11672g.f60740c = file2.getName();
                    c11672g.f60747j = file2;
                    c11672g.f60738a = 5;
                    String absolutePath = file2.getAbsolutePath();
                    c11672g.f60744g = absolutePath;
                    if (this.f60705h1.containsKey(absolutePath)) {
                        str = (String) this.f60705h1.get(c11672g.f60744g);
                    } else {
                        str = c11672g.f60744g;
                    }
                    c11672g.f60743f = str;
                    String[] split = file2.getName().split("\\.");
                    if (split.length > 1) {
                        str2 = split[split.length - 1];
                    } else {
                        str2 = "?";
                    }
                    c11672g.f60742e = str2;
                    long length = file2.length();
                    c11672g.f60746i = length;
                    c11672g.f60741d = AbstractC23041d2.m118214m(Locale.ROOT, length);
                    c11672g.f60745h = file2.lastModified();
                    c11672g.f60755r = m65026dN(c11672g.f60744g);
                    this.f60690S0.add(c11672g);
                }
            }
        }
    }

    /* renamed from: bN */
    private String m65024bN(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str = uri2.split("/1/")[1];
                int indexOf = str.indexOf("/ACTUAL");
                if (indexOf != -1) {
                    uri = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return AbstractC23254w8.m119855c(MainApplication.getAppContext(), uri);
    }

    /* renamed from: cN */
    private String m65025cN(List list) {
        Comparator comparator;
        if (this.f60703f1 == 0) {
            comparator = this.f60720w1;
        } else {
            comparator = this.f60722y1;
        }
        Collections.sort(list, comparator);
        return ((C11674i) list.get(0)).getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public boolean m65026dN(String str) {
        ArrayList arrayList = this.f60694W0;
        if (arrayList != null && arrayList.size() != 0 && str != null && !TextUtils.isEmpty(str)) {
            Iterator it = this.f60694W0.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public static /* synthetic */ int m65027eN(C11674i c11674i, C11674i c11674i2) {
        return c11674i.getName().compareToIgnoreCase(c11674i2.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public static /* synthetic */ int m65028fN(C11672g c11672g, C11672g c11672g2) {
        int i11 = c11672g.f60738a;
        int i12 = c11672g2.f60738a;
        if (i11 != i12) {
            if (i11 <= i12) {
                return -1;
            }
            return 1;
        }
        long j11 = c11672g.f60745h;
        long j12 = c11672g2.f60745h;
        if (j11 == j12) {
            return 0;
        }
        if (j11 >= j12) {
            return -1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public static /* synthetic */ int m65030gN(C11674i c11674i, C11674i c11674i2) {
        long j11 = c11674i.f60756p;
        long j12 = c11674i2.f60756p;
        if (j11 == j12) {
            return 0;
        }
        if (j11 < j12) {
            return 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public static /* synthetic */ int m65032hN(C11672g c11672g, C11672g c11672g2) {
        int i11 = c11672g.f60738a;
        int i12 = c11672g2.f60738a;
        if (i11 != i12) {
            if (i11 > i12) {
                return 1;
            }
            return -1;
        }
        if (i11 != 5 && i11 != 4 && i11 != 3) {
            return 0;
        }
        return c11672g.f60740c.compareToIgnoreCase(c11672g2.f60740c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public /* synthetic */ void m65034iN(InterfaceC17463d interfaceC17463d) {
        if (this.f60696Y0) {
            m65066xN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public /* synthetic */ void m65036jN(View view) {
        AbstractC2379w.m12432f(this.f60699b1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public /* synthetic */ void m65038kN(View view) {
        ArrayList arrayList;
        if (this.f60694W0.size() == 1) {
            this.f60693V0 = new File((String) this.f60694W0.get(0)).getName();
        }
        if (this.f60695X0.size() == 1) {
            this.f60693V0 = new C20556f(((Uri) this.f60695X0.get(0)).toString()).m106835h();
        }
        ArrayList arrayList2 = this.f60694W0;
        if ((arrayList2 != null && arrayList2.size() != 0) || ((arrayList = this.f60695X0) != null && arrayList.size() != 0)) {
            if (!TextUtils.isEmpty(this.f60693V0) || (this.f60694W0.size() != 1 && this.f60695X0.size() != 1)) {
                this.f60696Y0 = false;
                this.f72421L0.showDialog(20);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public /* synthetic */ void m65040lN(RecyclerView recyclerView, int i11, View view) {
        if (i11 >= 0) {
            try {
                if (i11 < this.f60688Q0.mo10003k() && !this.f60715r1) {
                    this.f60687P0.clearAnimation();
                    C11672g m64969P = this.f60688Q0.m64969P(i11);
                    int i12 = m64969P.f60738a;
                    if (i12 != 6 && i12 != 2 && i12 != 0) {
                        if (i12 == 5) {
                            m65058uN(1, "", i11);
                        } else if (m64969P.f60744g.equals("PHONE_STORAGE_PATH")) {
                            PackageManager packageManager = MainApplication.getAppContext().getPackageManager();
                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                            intent.addCategory("android.intent.category.OPENABLE");
                            intent.setType("*/*");
                            if (intent.resolveActivityInfo(packageManager, 0) != null && !this.f72421L0.m92676n2().mo35576n3()) {
                                startActivityForResult(intent, 1030);
                            }
                        } else if (this.f60691T0.size() > 0 && m64969P.f60744g.equals("PREVIOUS_FOLDER_PATH")) {
                            ArrayList arrayList = this.f60691T0;
                            C11671f c11671f = (C11671f) arrayList.remove(arrayList.size() - 1);
                            this.f60712o1 = c11671f;
                            m65058uN(0, c11671f.f60737c, -1);
                        } else {
                            C11671f c11671f2 = new C11671f();
                            this.f60712o1 = c11671f2;
                            c11671f2.f60735a = this.f60698a1.m9740Y1();
                            this.f60712o1.f60736b = this.f60687P0.getChildAt(0).getTop();
                            C11671f c11671f3 = this.f60712o1;
                            c11671f3.f60737c = this.f60689R0;
                            this.f60691T0.add(c11671f3);
                            m65058uN(0, m64969P.f60744g, i11);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public /* synthetic */ void m65042mN() {
        if (mo60294yp()) {
            return;
        }
        this.f60714q1 = false;
        this.f60697Z0.setVisibility(8);
        this.f60688Q0.m10008p();
        this.f72421L0.invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public /* synthetic */ void m65044nN(int i11) {
        Comparator comparator;
        this.f60703f1 = i11;
        AbstractC23309i.m122216no(i11);
        ArrayList arrayList = this.f60690S0;
        if (this.f60703f1 == 0) {
            comparator = this.f60719v1;
        } else {
            comparator = this.f60721x1;
        }
        Collections.sort(arrayList, comparator);
        this.f60688Q0.m64974U(this.f60690S0, false);
        this.f72827B0.post(new Runnable() { // from class: f60.d
            @Override // java.lang.Runnable
            public final void run() {
                FileSelectView.this.m65042mN();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public /* synthetic */ void m65046oN() {
        if (mo60294yp()) {
            return;
        }
        this.f60697Z0.setVisibility(8);
        this.f60714q1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public /* synthetic */ void m65048pN() {
        this.f60705h1.clear();
        this.f60706i1.clear();
        m65060vN(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        m65060vN(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        if (this.f60714q1) {
            this.f72827B0.post(new Runnable() { // from class: f60.c
                @Override // java.lang.Runnable
                public final void run() {
                    FileSelectView.this.m65046oN();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public void m65050qN(File file) {
        Comparator comparator;
        ArrayList arrayList;
        String str;
        String str2;
        this.f60689R0 = file.getAbsolutePath();
        this.f60690S0.clear();
        List<C11674i> list = (List) this.f60706i1.get(this.f60689R0);
        if (list != null && list.size() != 0) {
            for (C11674i c11674i : list) {
                C11672g c11672g = new C11672g();
                c11672g.f60740c = c11674i.getName();
                c11672g.f60747j = c11674i;
                c11672g.f60745h = c11674i.f60756p;
                c11672g.f60738a = 5;
                String absolutePath = c11674i.getAbsolutePath();
                c11672g.f60744g = absolutePath;
                if (this.f60705h1.containsKey(absolutePath)) {
                    str = (String) this.f60705h1.get(c11672g.f60744g);
                } else {
                    str = c11672g.f60744g;
                }
                c11672g.f60743f = str;
                String[] split = c11674i.getName().split("\\.");
                if (split.length > 1) {
                    str2 = split[split.length - 1];
                } else {
                    str2 = "?";
                }
                c11672g.f60742e = str2;
                long j11 = c11674i.f60757q;
                c11672g.f60746i = j11;
                c11672g.f60741d = AbstractC23041d2.m118214m(Locale.ROOT, j11);
                c11672g.f60755r = m65026dN(c11672g.f60744g);
                this.f60690S0.add(c11672g);
            }
        }
        if (this.f60712o1 != null && (arrayList = this.f60691T0) != null && arrayList.size() > 0) {
            C11672g c11672g2 = new C11672g();
            c11672g2.f60740c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_back_title);
            c11672g2.f60738a = 1;
            ArrayList arrayList2 = this.f60691T0;
            C11671f c11671f = (C11671f) arrayList2.get(arrayList2.size() - 1);
            if (c11671f.f60737c.equals("ROOT_PATH")) {
                c11672g2.f60741d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_bar_send_file_title);
            } else if (c11671f.f60737c.equals("PHOTO_VIDEO_PATH")) {
                c11672g2.f60741d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_photo_video_title);
            } else {
                c11672g2.f60741d = c11671f.f60737c;
            }
            c11672g2.f60744g = "PREVIOUS_FOLDER_PATH";
            c11672g2.f60739b = AbstractC16803z.icn_back_folder;
            this.f60690S0.add(0, c11672g2);
        } else {
            C11672g c11672g3 = new C11672g();
            c11672g3.f60738a = 1;
            c11672g3.f60740c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_photo_video_title);
            c11672g3.f60741d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_photo_video_sub_title);
            c11672g3.f60744g = "PHOTO_VIDEO_PATH";
            c11672g3.f60739b = AbstractC16803z.icn_filepicker_photovideo;
            c11672g3.f60745h = 0L;
            if (!this.f72421L0.m92676n2().mo35576n3()) {
                C11672g c11672g4 = new C11672g();
                c11672g4.f60738a = 1;
                c11672g4.f60740c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_phone_storage_title);
                c11672g4.f60741d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_phone_storage_sub_title);
                c11672g4.f60739b = AbstractC16803z.icn_filepicker_storage;
                c11672g4.f60744g = "PHONE_STORAGE_PATH";
                this.f60690S0.add(0, c11672g4);
                this.f60690S0.add(1, c11672g3);
            } else {
                this.f60690S0.add(0, c11672g3);
            }
        }
        if (this.f60694W0.size() != 0 || this.f60695X0.size() != 0) {
            this.f60690S0.add(this.f60710m1);
        }
        ArrayList arrayList3 = this.f60690S0;
        if (this.f60703f1 == 0) {
            comparator = this.f60719v1;
        } else {
            comparator = this.f60721x1;
        }
        Collections.sort(arrayList3, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public void m65052rN() {
        Comparator comparator;
        try {
            this.f60689R0 = "ROOT_PATH";
            this.f60690S0.clear();
            C26275a m122751d = C23343a.m122751d(this.f60717t1, 2);
            if (m122751d != null) {
                C11672g c11672g = new C11672g();
                c11672g.f60738a = 0;
                c11672g.f60745h = 0L;
                c11672g.f60750m = m122751d.m135169e();
                c11672g.f60751n = m122751d.m135165a();
                c11672g.f60740c = m122751d.m135174j();
                c11672g.f60752o = m122751d.m135173i();
                c11672g.f60753p = m122751d.m135166b();
                c11672g.f60754q = m122751d.m135170f();
                this.f60690S0.add(c11672g);
            }
            if (!this.f72421L0.m92676n2().mo35576n3()) {
                C11672g c11672g2 = new C11672g();
                c11672g2.f60738a = 1;
                c11672g2.f60740c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_phone_storage_title);
                c11672g2.f60741d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_phone_storage_sub_title);
                c11672g2.f60739b = AbstractC16803z.icn_filepicker_storage;
                c11672g2.f60745h = 0L;
                c11672g2.f60744g = "PHONE_STORAGE_PATH";
                this.f60690S0.add(c11672g2);
            }
            C11672g c11672g3 = new C11672g();
            c11672g3.f60738a = 1;
            c11672g3.f60740c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_photo_video_title);
            c11672g3.f60741d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_photo_video_sub_title);
            c11672g3.f60744g = "PHOTO_VIDEO_PATH";
            c11672g3.f60739b = AbstractC16803z.icn_filepicker_photovideo;
            c11672g3.f60745h = 0L;
            this.f60690S0.add(c11672g3);
            C11672g c11672g4 = new C11672g();
            c11672g4.f60738a = 2;
            c11672g4.f60740c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_recent_title);
            c11672g4.f60745h = 0L;
            this.f60690S0.add(c11672g4);
            m65023aN(new File(AbstractC20130d.m104853R()));
            m65023aN(new File(AbstractC23204s0.m119554e(), ""));
            m65023aN(new File(Environment.getExternalStorageDirectory(), Environment.DIRECTORY_DOWNLOADS));
            if (this.f60694W0.size() != 0) {
                this.f60690S0.add(this.f60710m1);
            }
            ArrayList arrayList = this.f60690S0;
            if (this.f60703f1 == 0) {
                comparator = this.f60719v1;
            } else {
                comparator = this.f60721x1;
            }
            Collections.sort(arrayList, comparator);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public void m65054sN() {
        Comparator comparator;
        this.f60690S0.clear();
        this.f60689R0 = "PHOTO_VIDEO_PATH";
        Iterator it = this.f60706i1.keySet().iterator();
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            File file = new File(str);
            C11672g c11672g = new C11672g();
            c11672g.f60740c = file.getName();
            c11672g.f60747j = file;
            c11672g.f60745h = file.lastModified();
            c11672g.f60744g = str;
            c11672g.f60738a = 3;
            c11672g.f60739b = AbstractC16803z.thumb_album;
            List list = (List) this.f60706i1.get(str);
            if (list != null) {
                i11 = list.size();
            }
            c11672g.f60748k = i11;
            c11672g.f60743f = (String) this.f60705h1.get(m65025cN((List) this.f60706i1.get(str)));
            this.f60690S0.add(c11672g);
        }
        C11672g c11672g2 = new C11672g();
        c11672g2.f60740c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_back_title);
        c11672g2.f60738a = 1;
        c11672g2.f60739b = AbstractC16803z.icn_back_folder;
        c11672g2.f60741d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_bar_send_file_title);
        c11672g2.f60744g = "PREVIOUS_FOLDER_PATH";
        this.f60690S0.add(0, c11672g2);
        if (this.f60694W0.size() != 0 || this.f60695X0.size() != 0) {
            this.f60690S0.add(this.f60710m1);
        }
        ArrayList arrayList = this.f60690S0;
        if (this.f60703f1 == 0) {
            comparator = this.f60719v1;
        } else {
            comparator = this.f60721x1;
        }
        Collections.sort(arrayList, comparator);
    }

    /* renamed from: tN */
    private boolean m65056tN(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null || clipData.getItemCount() == 0) {
            return false;
        }
        int itemCount = clipData.getItemCount();
        if (itemCount > AbstractC23309i.m121336Q7()) {
            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_select_file_reach_limit), Integer.valueOf(AbstractC23309i.m121336Q7())));
            return false;
        }
        for (int i11 = 0; i11 < itemCount; i11++) {
            Uri uri = clipData.getItemAt(i11).getUri();
            String m65024bN = m65024bN(uri);
            if (m65024bN != null && !AbstractC23254w8.m119859g(m65024bN)) {
                this.f60694W0.add(m65024bN);
            } else {
                this.f60695X0.add(uri);
            }
        }
        return true;
    }

    /* renamed from: uN */
    private void m65058uN(int i11, String str, int i12) {
        this.f60716s1 = false;
        if (!TextUtils.isEmpty(str) || (i12 >= 0 && i12 < this.f60688Q0.mo10003k())) {
            if ((i11 != 0 && i11 != 1) || this.f60715r1) {
                return;
            }
            if (this.f60714q1) {
                this.f60697Z0.setState(MultiStateView.EnumC15914e.LOADING);
                this.f60697Z0.setVisibility(0);
            }
            this.f60715r1 = true;
            AbstractC0837p0.m2225f().mo2040a(this.f60707j1.m65080a(i11, str, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:14:0x0037, B:16:0x003d, B:17:0x004d, B:19:0x006d, B:21:0x00b1, B:23:0x00ce, B:25:0x00d8, B:27:0x00e0, B:28:0x00ee, B:29:0x00e9, B:30:0x00f6, B:34:0x008f, B:36:0x0097), top: B:13:0x0037, outer: #1 }] */
    /* renamed from: vN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m65060vN(Uri uri) {
        File parentFile;
        List arrayList;
        if (this.f60705h1 != null && this.f60706i1 != null) {
            try {
                Cursor m135984j = C26388b.m135984j(getContext(), uri, new String[]{"_data", "_id", "date_modified", "_size"}, null, null, null, false);
                if (m135984j != null) {
                    try {
                        if (m135984j.moveToFirst()) {
                            int columnIndex = m135984j.getColumnIndex("_data");
                            int columnIndex2 = m135984j.getColumnIndex("_id");
                            int columnIndex3 = m135984j.getColumnIndex("date_modified");
                            int columnIndex4 = m135984j.getColumnIndex("_size");
                            do {
                                String str = "";
                                long j11 = m135984j.getLong(columnIndex2);
                                String string = m135984j.getString(columnIndex);
                                String encode = URLEncoder.encode(string, "UTF-8");
                                long j12 = m135984j.getLong(columnIndex3);
                                long j13 = m135984j.getLong(columnIndex4);
                                if (uri.equals(MediaStore.Video.Media.EXTERNAL_CONTENT_URI)) {
                                    str = String.format("content://id=%d&data=%s&date=%d&type=video", Long.valueOf(j11), encode, Long.valueOf(j12));
                                } else if (uri.equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) {
                                    str = String.format("content://id=%d&data=%s&date=%d", Long.valueOf(j11), encode, Long.valueOf(j12));
                                    C11674i c11674i = new C11674i(string);
                                    c11674i.f60756p = j12 * 1000;
                                    c11674i.f60757q = j13;
                                    this.f60705h1.put(string, str);
                                    parentFile = new File(string).getParentFile();
                                    if (parentFile != null) {
                                        String absolutePath = parentFile.getAbsolutePath();
                                        if (!TextUtils.isEmpty(absolutePath)) {
                                            if (this.f60706i1.get(absolutePath) != null) {
                                                arrayList = (List) this.f60706i1.get(absolutePath);
                                            } else {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(c11674i);
                                            this.f60706i1.put(absolutePath, arrayList);
                                        }
                                    }
                                }
                                C11674i c11674i2 = new C11674i(string);
                                c11674i2.f60756p = j12 * 1000;
                                c11674i2.f60757q = j13;
                                this.f60705h1.put(string, str);
                                parentFile = new File(string).getParentFile();
                                if (parentFile != null) {
                                }
                            } while (m135984j.moveToNext());
                        }
                    } finally {
                    }
                }
                if (m135984j != null) {
                    m135984j.close();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public void m65062wN() {
        if (this.f60714q1) {
            return;
        }
        this.f60714q1 = true;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: f60.l
            @Override // java.lang.Runnable
            public final void run() {
                FileSelectView.this.m65048pN();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        C8009j.a aVar;
        if (i11 == 20) {
            InterfaceC17463d.c cVar = new InterfaceC17463d.c() { // from class: f60.k
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    FileSelectView.this.m65034iN(interfaceC17463d);
                }
            };
            if (!TextUtils.isEmpty(this.f60693V0) && ((this.f60694W0.size() == 1 && this.f60695X0.size() == 0) || (this.f60695X0.size() == 1 && this.f60694W0.size() == 0))) {
                String str = this.f60693V0;
                if (str.lastIndexOf(".") > 20) {
                    String m118217p = AbstractC23041d2.m118217p(str);
                    String substring = str.substring(0, 20);
                    String str2 = "..." + str.substring((str.length() - m118217p.length()) - 3, str.length() - m118217p.length()) + m118217p;
                    str = substring.substring(0, substring.length() - str2.length()) + str2;
                }
                aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(4).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send_file_confirm_2), str, this.f60692U0)).m43167p(cVar).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send), this);
            } else {
                ArrayList arrayList = this.f60694W0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    i12 = this.f60694W0.size();
                } else {
                    i12 = 0;
                }
                ArrayList arrayList2 = this.f60695X0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    i12 += this.f60695X0.size();
                }
                C8009j.a aVar2 = new C8009j.a(m92648SI());
                aVar2.m43159h(4).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_multi_confirm), Integer.valueOf(i12), this.f60692U0)).m43167p(cVar).m43165n(m92652XI(AbstractC8020f0.str_no), this).m43170s(m92652XI(AbstractC8020f0.str_yes), this);
                aVar = aVar2;
            }
            return aVar.m43152a();
        }
        return super.mo39014DJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        int i11;
        int i12;
        try {
            super.mo37482FJ(actionBarMenu);
            actionBarMenu.m92750r();
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.menu_item_search, AbstractC16803z.icn_header_search);
            ActionBarMenuItem m92738e2 = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_filepicker_sort);
            this.f60702e1 = m92738e2;
            Context context = getContext();
            int i13 = AbstractC8020f0.str_sort_by_date;
            if (this.f60703f1 == 0) {
                i11 = AbstractC16803z.btn_radio_on_holo_light;
            } else {
                i11 = AbstractC16803z.btn_radio_off_holo_light;
            }
            m92738e2.m92774j(AbstractC23136l9.m118727m(context, 0, i13, i11));
            ActionBarMenuItem actionBarMenuItem = this.f60702e1;
            Context context2 = getContext();
            int i14 = AbstractC8020f0.str_sort_by_name;
            if (this.f60703f1 == 1) {
                i12 = AbstractC16803z.btn_radio_on_holo_light;
            } else {
                i12 = AbstractC16803z.btn_radio_off_holo_light;
            }
            actionBarMenuItem.m92774j(AbstractC23136l9.m118727m(context2, 1, i14, i12));
            m92738e.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
            m92738e.m92767A(this.f60718u1);
            EditText searchField = m92738e.getSearchField();
            this.f60699b1 = searchField;
            if (searchField != null) {
                searchField.setEllipsize(TextUtils.TruncateAt.END);
                EditText editText = this.f60699b1;
                editText.setHintTextColor(AbstractC23136l9.m118641B(editText.getContext(), AbstractC16801x.white_50));
                EditText editText2 = this.f60699b1;
                editText2.setTextColor(AbstractC23136l9.m118641B(editText2.getContext(), AbstractC16801x.white));
                this.f60699b1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_default_search));
                this.f60699b1.setOnClickListener(new View.OnClickListener() { // from class: f60.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FileSelectView.this.m65036jN(view);
                    }
                });
                if (this.f60699b1.getParent() != null) {
                    ((View) this.f60699b1.getParent()).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C23528a c23528a = new C23528a(this.f72421L0.m92648SI());
        m92637BK(true);
        View inflate = layoutInflater.inflate(AbstractC7409c0.file_select_view, viewGroup, false);
        this.f60687P0 = (RecyclerView) inflate.findViewById(AbstractC6918a0.list_view);
        this.f60697Z0 = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        this.f60700c1 = inflate.findViewById(AbstractC6918a0.layout_bottom);
        View findViewById = inflate.findViewById(AbstractC6918a0.btn_send_multi_selected_files);
        this.f60701d1 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.txt_selected_count);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
        this.f60698a1 = linearLayoutManager;
        this.f60687P0.setLayoutManager(linearLayoutManager);
        FileSelectAdapter fileSelectAdapter = new FileSelectAdapter(this.f72421L0.m92648SI(), c23528a, this.f60717t1);
        this.f60688Q0 = fileSelectAdapter;
        fileSelectAdapter.m9999J(true);
        this.f60687P0.setAdapter(this.f60688Q0);
        RecyclerView.AbstractC1885l itemAnimator = this.f60687P0.getItemAnimator();
        itemAnimator.m10057w(0L);
        itemAnimator.m10035A(0L);
        itemAnimator.m10060z(120L);
        itemAnimator.m10058x(120L);
        this.f60687P0.setItemAnimator(itemAnimator);
        this.f60706i1 = Collections.synchronizedMap(new HashMap());
        this.f60705h1 = Collections.synchronizedMap(new HashMap());
        C11672g c11672g = new C11672g();
        this.f60710m1 = c11672g;
        c11672g.f60738a = 7;
        this.f60694W0 = new ArrayList();
        this.f60695X0 = new ArrayList();
        this.f60713p1 = new C11666a(this.f72827B0);
        m65062wN();
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: f60.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileSelectView.this.m65038kN(view);
            }
        });
        this.f60687P0.m9826E(new C11667b());
        C31784b.m152808a(this.f60687P0).m152809b(new C31784b.d() { // from class: f60.e
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                FileSelectView.this.m65040lN(recyclerView, i11, view);
            }
        });
        this.f60707j1 = new RunnableC11670e(new C11668c());
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        this.f60687P0.clearAnimation();
        MainApplication.getAppContext().getContentResolver().unregisterContentObserver(this.f60713p1);
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 20) {
                if (i11 == -1) {
                    Intent intent = new Intent();
                    if (this.f60696Y0) {
                        AbstractC23647d.m123897g("92321");
                    } else {
                        AbstractC23647d.m123897g("923331");
                    }
                    ArrayList arrayList = this.f60694W0;
                    if (arrayList != null && arrayList.size() != 0) {
                        intent.putExtra("extra_selected_file", this.f60694W0);
                        this.f72421L0.mo50035CK(200, intent);
                    }
                    ArrayList arrayList2 = this.f60695X0;
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        intent.putExtra("extra_selected_file", this.f60695X0);
                        this.f72421L0.mo50035CK(201, intent);
                    }
                    interfaceC17463d.dismiss();
                    finish();
                    return;
                }
                if (i11 == -2) {
                    if (this.f60696Y0) {
                        m65066xN();
                        AbstractC23647d.m123897g("92322");
                    } else {
                        AbstractC23647d.m123897g("923330");
                    }
                    interfaceC17463d.dismiss();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(final int i11) {
        String str;
        try {
            if (i11 == 16908332) {
                EditText editText = this.f60699b1;
                if (editText != null) {
                    AbstractC2379w.m12430d(editText);
                    if (this.f60709l1) {
                        if (this.f60699b1.getText() == null) {
                            str = "";
                        } else {
                            str = this.f60699b1.getText().toString();
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f60699b1.setText("");
                        }
                        this.f88763d0.m92751s();
                        return true;
                    }
                }
            } else {
                int i12 = 0;
                if (i11 != 0 && i11 != 1) {
                    if (i11 == AbstractC6918a0.menu_item_search) {
                        View clearButton = this.f88763d0.m92752u(i11).getClearButton();
                        this.f60711n1 = clearButton;
                        if (clearButton != null) {
                            if (TextUtils.isEmpty(this.f60699b1.getText().toString())) {
                                i12 = 4;
                            }
                            clearButton.setVisibility(i12);
                        }
                    }
                }
                if (i11 != this.f60703f1) {
                    if (!this.f60714q1) {
                        this.f60714q1 = true;
                        this.f60697Z0.setState(MultiStateView.EnumC15914e.LOADING);
                        this.f60697Z0.setVisibility(0);
                        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: f60.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileSelectView.this.m65044nN(i11);
                            }
                        });
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.loading));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_bar_send_file_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FileSelectView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1030 && i12 == -1 && intent != null) {
            try {
                m65066xN();
                this.f60708k1 = false;
                this.f60690S0.remove(this.f60710m1);
                this.f60688Q0.m64968O().remove(this.f60710m1);
                FileSelectAdapter fileSelectAdapter = this.f60688Q0;
                fileSelectAdapter.m10017y(fileSelectAdapter.mo10003k());
                ArrayList<C11672g> m64968O = this.f60688Q0.m64968O();
                for (C11672g c11672g : m64968O) {
                    if (c11672g.f60755r) {
                        c11672g.f60755r = false;
                        this.f60688Q0.m10010r(m64968O.indexOf(c11672g), 0);
                    }
                }
                this.f60700c1.setVisibility(8);
                if (this.f60694W0 == null) {
                    this.f60694W0 = new ArrayList();
                }
                if (this.f60695X0 == null) {
                    this.f60695X0 = new ArrayList();
                }
                if (intent.getData() != null) {
                    Uri data = intent.getData();
                    try {
                        Cursor m135983i = C26388b.m135983i(this.f72421L0.getContext(), data, null, null, null, null, null, false);
                        if (m135983i != null) {
                            try {
                                if (m135983i.moveToFirst()) {
                                    this.f60693V0 = m135983i.getString(m135983i.getColumnIndex("_display_name"));
                                    int columnIndex = m135983i.getColumnIndex("_size");
                                    if (!m135983i.isNull(columnIndex)) {
                                        long j11 = m135983i.getLong(columnIndex);
                                        if (j11 > 0 && j11 > f60686z1) {
                                            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_upload_file_limit), AbstractC23041d2.m118214m(Locale.ROOT, f60686z1)));
                                            m135983i.close();
                                            return;
                                        }
                                    }
                                    String m65024bN = m65024bN(data);
                                    if (m65024bN != null && !AbstractC23254w8.m119859g(m65024bN)) {
                                        this.f60694W0.add(m65024bN);
                                    }
                                    this.f60695X0.add(data);
                                }
                            } catch (Throwable th2) {
                                try {
                                    m135983i.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                        if (m135983i != null) {
                            m135983i.close();
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                } else if (intent.getClipData() != null) {
                    if (!m65056tN(intent)) {
                        return;
                    }
                } else {
                    return;
                }
                this.f60696Y0 = true;
                this.f72421L0.showDialog(20);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        String str;
        if (i11 == 4) {
            EditText editText = this.f60699b1;
            if (editText != null) {
                AbstractC2379w.m12430d(editText);
                if (this.f60709l1) {
                    if (this.f60699b1.getText() == null) {
                        str = "";
                    } else {
                        str = this.f60699b1.getText().toString();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.f60699b1.setText("");
                    }
                    this.f88763d0.m92751s();
                    return true;
                }
            }
            if (this.f60691T0.size() > 0) {
                if (!this.f60715r1) {
                    ArrayList arrayList = this.f60691T0;
                    C11671f c11671f = (C11671f) arrayList.remove(arrayList.size() - 1);
                    this.f60712o1 = c11671f;
                    m65058uN(0, c11671f.f60737c, -1);
                    AbstractC23647d.m123906p("92312");
                    AbstractC23647d.m123893c();
                }
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 109) {
            try {
                this.f72421L0.m92648SI().getContentResolver().notifyChange(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (iArr.length > 0 && iArr[0] == 0) {
                m65058uN(0, "ROOT_PATH", -1);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        MainApplication.getAppContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f60713p1);
        MainApplication.getAppContext().getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.f60713p1);
        if (this.f60716s1 && this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().mo35576n3() && this.f72421L0.m92648SI() != null && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112029f) == 0) {
            m65058uN(0, "ROOT_PATH", -1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int lastIndexOf;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("extra_name_send_to")) {
            String string = m92642L3.getString("extra_name_send_to");
            this.f60692U0 = string;
            if (!TextUtils.isEmpty(string) && this.f60692U0.length() > 20 && (lastIndexOf = this.f60692U0.lastIndexOf(" ", 19)) > 0) {
                this.f60692U0 = this.f60692U0.substring(0, lastIndexOf) + "...";
            }
        }
        this.f60703f1 = AbstractC23309i.m122043j4();
        this.f72421L0.invalidateOptionsMenu();
        Context m92648SI = this.f72421L0.m92648SI();
        String[] strArr = AbstractC23034c6.f112029f;
        if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
            AbstractC23034c6.m118184v0(this, strArr, 109);
            this.f60716s1 = true;
        } else {
            m65058uN(0, "ROOT_PATH", -1);
        }
    }

    /* renamed from: xN */
    void m65066xN() {
        this.f60693V0 = "";
        ArrayList arrayList = this.f60694W0;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f60695X0;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }
}
