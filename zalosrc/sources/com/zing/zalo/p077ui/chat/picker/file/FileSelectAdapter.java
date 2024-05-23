package com.zing.zalo.p077ui.chat.picker.file;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.res.AbstractC1401h;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import hd0.C20003a;
import id0.C20518d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import ml.C23343a;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p269jj.C21275a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import vg.AbstractC28236y3;

/* loaded from: classes5.dex */
public class FileSelectAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: s */
    private final Context f60606s;

    /* renamed from: t */
    private final C23528a f60607t;

    /* renamed from: w */
    private final C21275a f60610w;

    /* renamed from: r */
    private final int f60605r = 10;

    /* renamed from: u */
    public boolean f60608u = false;

    /* renamed from: v */
    private int f60609v = -1;

    /* renamed from: x */
    ArrayList f60611x = new ArrayList();

    /* loaded from: classes5.dex */
    public static class BaseFolderView extends FileItemModulesView {

        /* renamed from: K */
        protected final int f60612K;

        /* renamed from: L */
        protected final int f60613L;

        /* renamed from: M */
        protected final int f60614M;

        /* renamed from: N */
        protected final int f60615N;

        /* renamed from: O */
        protected final int f60616O;

        /* renamed from: P */
        protected final int f60617P;

        /* renamed from: Q */
        protected final int f60618Q;

        /* renamed from: R */
        protected C21693c f60619R;

        /* renamed from: S */
        protected C16716d f60620S;

        /* renamed from: T */
        protected C22126c0 f60621T;

        /* renamed from: U */
        protected C22126c0 f60622U;

        /* renamed from: V */
        protected C13704p1 f60623V;

        /* renamed from: W */
        protected String f60624W;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$BaseFolderView$a */
        /* loaded from: classes5.dex */
        public class C11658a extends C22126c0 {
            C11658a(Context context) {
                super(context);
            }

            @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
            /* renamed from: q0 */
            public void mo44180q0(int i11, int i12, int i13, int i14) {
                try {
                    String str = BaseFolderView.this.f60624W;
                    if (str != null && !TextUtils.isEmpty(str)) {
                        String str2 = BaseFolderView.this.f60624W;
                        int length = str2.length();
                        BaseFolderView baseFolderView = BaseFolderView.this;
                        StaticLayout staticLayout = new StaticLayout(str2, 0, length, baseFolderView.f60623V, baseFolderView.f60620S.getWidthMeasureSize(), Layout.Alignment.ALIGN_NORMAL, 1.0f, AbstractC23136l9.m118742r(1.0f), false, TextUtils.TruncateAt.END, BaseFolderView.this.f60620S.getWidthMeasureSize());
                        if (staticLayout.getLineCount() > 1) {
                            String substring = BaseFolderView.this.f60624W.substring(0, staticLayout.getLineEnd(0));
                            String str3 = "..." + BaseFolderView.this.f60624W.substring(Math.max(0, r2.length() - 7));
                            BaseFolderView.this.f60624W = substring.substring(0, substring.length() - str3.length()) + str3;
                        }
                        m111959G1(BaseFolderView.this.f60624W);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                super.mo44180q0(i11, i12, i13, i14);
            }
        }

        public BaseFolderView(Context context) {
            super(context);
            int m118759w1 = AbstractC23136l9.m118759w1(12);
            this.f60612K = m118759w1;
            int m118759w12 = AbstractC23136l9.m118759w1(15);
            this.f60613L = m118759w12;
            int m118742r = AbstractC23136l9.m118742r(56.0f);
            this.f60614M = m118742r;
            int m118742r2 = AbstractC23136l9.m118742r(16.0f);
            this.f60615N = m118742r2;
            int m118742r3 = AbstractC23136l9.m118742r(7.0f);
            this.f60616O = m118742r3;
            int m118742r4 = AbstractC23136l9.m118742r(16.0f);
            this.f60617P = m118742r4;
            int m118742r5 = AbstractC23136l9.m118742r(6.0f);
            this.f60618Q = m118742r5;
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            C13704p1 c13704p1 = new C13704p1(1);
            this.f60623V = c13704p1;
            c13704p1.setTextSize(m118759w12);
            C21693c c21693c = new C21693c(context);
            this.f60619R = c21693c;
            C16718f m89028L = c21693c.m89106L().m89028L(m118742r, m118742r);
            Boolean bool = Boolean.TRUE;
            m89028L.m89073z(bool).m89018B(bool).m89032P(m118742r2, m118742r3, m118742r2, m118742r3);
            this.f60619R.m111929z1(0);
            this.f60619R.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_folder));
            mo69681L(this.f60619R);
            C16716d c16716d = new C16716d(context);
            this.f60620S = c16716d;
            c16716d.m89106L().m89028L(-1, -2).m89035S(m118742r4).m89054h0(this.f60619R).m89027K(true);
            C11658a c11658a = new C11658a(context);
            this.f60621T = c11658a;
            c11658a.m89106L().m89028L(-2, -2).m89073z(bool);
            this.f60621T.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f60621T.mo111964L1(m118759w12);
            this.f60621T.m111953A1(1);
            this.f60620S.m89001g1(this.f60621T);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f60622U = c22126c0;
            c22126c0.m89106L().m89028L(-2, -2).m89023G(this.f60621T).m89036T(m118742r5);
            this.f60622U.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            this.f60622U.mo111964L1(m118759w1);
            this.f60622U.m111953A1(1);
            this.f60622U.m111957E1(true);
            this.f60622U.m111980v1(TextUtils.TruncateAt.END);
            this.f60620S.m89001g1(this.f60622U);
            mo69681L(this.f60620S);
            C16719g c16719g = new C16719g(getContext());
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ChatLinkHighlightColor));
            c16719g.m89106L().m89028L(-1, 1).m89024H(new C20003a(this.f60619R, this.f60620S));
            c16719g.mo44614b1(8);
            mo69681L(c16719g);
            AbstractC23136l9.m118696b1(this, AbstractC1401h.m7082f(getResources(), AbstractC16803z.stencils_contact_bg, getContext().getTheme()));
        }

        @Override // com.zing.zalo.ui.chat.picker.file.FileSelectAdapter.FileItemModulesView, com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter.InterfaceC11663a
        /* renamed from: u */
        public void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11) {
            try {
                this.f60621T.m111959G1("");
                if (c11672g.f60739b != 0) {
                    C21693c c21693c = this.f60619R;
                    c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), c11672g.f60739b));
                }
                this.f60624W = c11672g.f60740c;
                this.f60622U.m111959G1(c11672g.f60741d);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    public class CustomFolderView extends BaseFolderView {

        /* renamed from: a0 */
        private final int f60626a0;

        /* renamed from: b0 */
        private final C3977j f60627b0;

        /* renamed from: c0 */
        private String f60628c0;

        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$CustomFolderView$a */
        /* loaded from: classes5.dex */
        class C11659a extends C23999j {
            C11659a() {
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                try {
                    if (!TextUtils.isEmpty(str) && str.equals(CustomFolderView.this.f60628c0) && c3979l != null) {
                        CustomFolderView.this.f60627b0.setImageInfo(c3979l, false);
                        Bitmap m18839c = c3979l.m18839c();
                        if (m18839c != null) {
                            if (m18839c.getWidth() == 1 && m18839c.getHeight() == 1) {
                                return;
                            }
                            CustomFolderView.this.f60619R.mo111924u1(m18839c);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public CustomFolderView(Context context) {
            super(context);
            this.f60626a0 = AbstractC23136l9.m118742r(5.8f);
            this.f60627b0 = new C3977j(context);
        }

        @Override // com.zing.zalo.ui.chat.picker.file.FileSelectAdapter.BaseFolderView, com.zing.zalo.ui.chat.picker.file.FileSelectAdapter.FileItemModulesView, com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter.InterfaceC11663a
        /* renamed from: u */
        public void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11) {
            String str;
            try {
                this.f60621T.m111959G1("");
                C21693c c21693c = this.f60619R;
                c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.icn_folder));
                this.f60619R.m89159y0(null);
                this.f60619R.m111929z1(0);
                this.f60622U.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_picker_last_modified) + " " + AbstractC23160o0.m119201K(c11672g.f60745h));
                if (c11672g.f60748k == 0) {
                    str = c11672g.f60740c;
                } else {
                    str = c11672g.f60740c + " (" + c11672g.f60748k + ")";
                }
                this.f60624W = str;
                if (c11672g.f60738a == 3) {
                    this.f60619R.m89106L().m89041Y(this.f60626a0);
                    this.f60619R.mo111924u1(null);
                    this.f60619R.m111929z1(5);
                    this.f60619R.m89087B0(AbstractC16803z.thumb_album);
                    String str2 = c11672g.f60743f;
                    this.f60628c0 = str2;
                    C24003n c24003n = new C24003n();
                    c24003n.f116275p = true;
                    c24003n.f116276q = true;
                    c24003n.f116263d = true;
                    c24003n.f116266g = C23278z2.m120110a();
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        c24003n.f116260a = AbstractC23006a0.m117883M();
                    }
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        if (C23999j.m125696L2(str2, c24003n)) {
                            C3979l m123606l = FileSelectAdapter.this.f60607t.m123606l(str2, c24003n.f116260a, c24003n.f116263d, c24003n.f116266g);
                            if (m123606l != null) {
                                this.f60627b0.setImageInfo(m123606l);
                                this.f60619R.mo111924u1(m123606l.m18839c());
                                return;
                            }
                            return;
                        }
                        ((C23528a) FileSelectAdapter.this.f60607t.m123612r(this.f60627b0)).m123579C(str2, c24003n, new C11659a());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class EmptySearchView extends FileItemModulesView {

        /* renamed from: K */
        private final int f60631K;

        /* renamed from: L */
        private final int f60632L;

        public EmptySearchView(Context context) {
            super(context);
            int m118742r = AbstractC23136l9.m118742r(16.0f);
            this.f60631K = m118742r;
            int m118742r2 = AbstractC23136l9.m118742r(16.0f);
            this.f60632L = m118742r2;
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m89106L().m89028L(-1, -2).m89041Y(m118742r);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
            c22126c0.mo111964L1(m118742r2);
            c22126c0.m111953A1(1);
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            c22126c0.m111959G1(MainApplication.getAppContext().getString(AbstractC8020f0.str_emptyResult));
            mo69681L(c22126c0);
        }
    }

    /* loaded from: classes5.dex */
    public static class FakeBottomView extends FileItemModulesView {

        /* renamed from: K */
        public static final int f60633K = AbstractC23136l9.m118742r(54.0f);

        public FakeBottomView(Context context) {
            super(context);
            C16719g c16719g = new C16719g(context);
            c16719g.m89106L().m89028L(-1, f60633K);
            mo69681L(c16719g);
        }
    }

    /* loaded from: classes5.dex */
    public static class FileItemModulesView extends ModulesView implements InterfaceC11663a {
        public FileItemModulesView(Context context) {
            super(context);
        }

        /* renamed from: u */
        public void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11) {
        }
    }

    /* loaded from: classes5.dex */
    public class FileView extends FileItemModulesView {

        /* renamed from: K */
        private final int f60634K;

        /* renamed from: L */
        private final int f60635L;

        /* renamed from: M */
        private final int f60636M;

        /* renamed from: N */
        private final int f60637N;

        /* renamed from: O */
        private final int f60638O;

        /* renamed from: P */
        private final int f60639P;

        /* renamed from: Q */
        private final int f60640Q;

        /* renamed from: R */
        private final int f60641R;

        /* renamed from: S */
        private final int f60642S;

        /* renamed from: T */
        private final int f60643T;

        /* renamed from: U */
        private final int f60644U;

        /* renamed from: V */
        private final int f60645V;

        /* renamed from: W */
        private final int f60646W;

        /* renamed from: a0 */
        private final int f60647a0;

        /* renamed from: b0 */
        private final C21693c f60648b0;

        /* renamed from: c0 */
        private final C22126c0 f60649c0;

        /* renamed from: d0 */
        private final C22126c0 f60650d0;

        /* renamed from: e0 */
        private final C22126c0 f60651e0;

        /* renamed from: f0 */
        private final C3977j f60652f0;

        /* renamed from: g0 */
        private final C16716d f60653g0;

        /* renamed from: h0 */
        private final C21691a f60654h0;

        /* renamed from: i0 */
        private final C21693c f60655i0;

        /* renamed from: j0 */
        private final C13704p1 f60656j0;

        /* renamed from: k0 */
        private CharSequence f60657k0;

        /* renamed from: l0 */
        private final StyleSpan f60658l0;

        /* renamed from: m0 */
        private String f60659m0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$FileView$a */
        /* loaded from: classes5.dex */
        public class C11660a extends C22126c0 {

            /* renamed from: m1 */
            final /* synthetic */ FileSelectAdapter f60661m1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11660a(Context context, FileSelectAdapter fileSelectAdapter) {
                super(context);
                this.f60661m1 = fileSelectAdapter;
            }

            @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
            /* renamed from: q0 */
            public void mo44180q0(int i11, int i12, int i13, int i14) {
                CharSequence subSequence;
                int length;
                int spanEnd;
                try {
                    if (FileView.this.f60657k0 != null && !TextUtils.isEmpty(FileView.this.f60657k0)) {
                        StaticLayout staticLayout = new StaticLayout(FileView.this.f60657k0, 0, FileView.this.f60657k0.length(), FileView.this.f60656j0, FileView.this.f60653g0.getWidthMeasureSize(), Layout.Alignment.ALIGN_NORMAL, 1.0f, AbstractC23136l9.m118742r(1.0f), false, TextUtils.TruncateAt.END, FileView.this.f60653g0.getWidthMeasureSize());
                        if (staticLayout.getLineCount() > 1) {
                            CharSequence subSequence2 = FileView.this.f60657k0.subSequence(0, staticLayout.getLineEnd(0));
                            CharSequence subSequence3 = FileView.this.f60657k0.subSequence(Math.max(0, FileView.this.f60657k0.length() - 7), FileView.this.f60657k0.length());
                            CharSequence concat = TextUtils.concat("...", subSequence3);
                            if (subSequence2.length() > FileSelectAdapter.this.f60605r) {
                                subSequence = subSequence2.subSequence(0, subSequence2.length() - Math.min(FileSelectAdapter.this.f60605r, subSequence2.length() - FileSelectAdapter.this.f60605r));
                            } else {
                                subSequence = subSequence2.subSequence(0, subSequence2.length());
                            }
                            CharSequence concat2 = TextUtils.concat(subSequence, concat);
                            if (concat2 instanceof SpannedString) {
                                int lastIndexOf = FileView.this.f60657k0.toString().lastIndexOf(subSequence3.toString());
                                SpannedString spannedString = (SpannedString) concat;
                                SpannedString spannedString2 = (SpannedString) concat2;
                                if (((SpannableString) subSequence).getSpanStart(FileView.this.f60658l0) != -1) {
                                    length = ((SpannableString) subSequence).getSpanStart(FileView.this.f60658l0);
                                } else if (((Spannable) FileView.this.f60657k0).getSpanStart(FileView.this.f60658l0) < lastIndexOf) {
                                    length = subSequence.length();
                                } else {
                                    length = subSequence.length() + ((SpannedString) concat).getSpanStart(FileView.this.f60658l0);
                                }
                                if (spannedString.getSpanStart(FileView.this.f60658l0) != -1) {
                                    spanEnd = subSequence.length() + spannedString.getSpanEnd(FileView.this.f60658l0);
                                } else if (((Spannable) FileView.this.f60657k0).getSpanEnd(FileView.this.f60658l0) > subSequence.length()) {
                                    spanEnd = subSequence.length() + 3;
                                } else {
                                    spanEnd = spannedString2.getSpanEnd(FileView.this.f60658l0);
                                }
                                if (length <= spanEnd) {
                                    SpannableString spannableString = new SpannableString(concat2.toString());
                                    spannableString.setSpan(FileView.this.f60658l0, length, spanEnd, 33);
                                    concat2 = spannableString;
                                }
                            }
                            FileView.this.f60657k0 = concat2;
                        }
                        m111959G1(FileView.this.f60657k0);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                super.mo44180q0(i11, i12, i13, i14);
            }
        }

        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$FileView$b */
        /* loaded from: classes5.dex */
        public class C11661b extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ long f60663l1;

            /* renamed from: m1 */
            final /* synthetic */ int f60664m1;

            C11661b(long j11, int i11) {
                this.f60663l1 = j11;
                this.f60664m1 = i11;
            }

            /* renamed from: H3 */
            public static /* synthetic */ void m64991H3(String str, long j11) {
                try {
                    File file = new File(str);
                    if (file.exists() && j11 > 0) {
                        file.setLastModified(j11);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                try {
                    if (!TextUtils.isEmpty(str) && str.equals(FileView.this.f60659m0)) {
                        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.picker.file.a

                            /* renamed from: p */
                            public final /* synthetic */ String f60760p;

                            /* renamed from: q */
                            public final /* synthetic */ long f60761q;

                            public /* synthetic */ RunnableC11676a(String str2, long j11) {
                                r1 = str2;
                                r2 = j11;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FileSelectAdapter.FileView.C11661b.m64991H3(r1, r2);
                            }
                        });
                        if (c3979l != null) {
                            FileView.this.f60652f0.setImageInfo(c3979l, false);
                            Bitmap m18839c = c3979l.m18839c();
                            if (m18839c != null) {
                                if (m18839c.getWidth() == 1) {
                                    if (m18839c.getHeight() != 1) {
                                    }
                                }
                                FileView.this.f60648b0.mo111924u1(m18839c);
                                FileView.this.f60648b0.m89135c1(new C20518d().m106593j(100L));
                            }
                            if (this.f60664m1 == AbstractC23322a.zds_ffic_mov_colored_48) {
                                FileView.this.f60655i0.mo44614b1(0);
                                return;
                            }
                            return;
                        }
                        FileView.this.f60648b0.mo111925v1(AbstractC23136l9.m118665N(FileView.this.f60648b0.getContext(), this.f60664m1));
                        FileView.this.f60648b0.m111929z1(0);
                        FileView.this.f60648b0.mo111927x1(0.0f);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public FileView(Context context) {
            super(context);
            int m118742r = AbstractC23136l9.m118742r(6.0f);
            this.f60634K = m118742r;
            int m118742r2 = AbstractC23136l9.m118742r(6.0f);
            this.f60635L = m118742r2;
            this.f60636M = AbstractC23136l9.m118742r(60.0f);
            int m118759w1 = AbstractC23136l9.m118759w1(15);
            this.f60637N = m118759w1;
            int m118742r3 = AbstractC23136l9.m118742r(26.0f);
            this.f60638O = m118742r3;
            int m118742r4 = AbstractC23136l9.m118742r(16.0f);
            this.f60639P = m118742r4;
            int m118742r5 = AbstractC23136l9.m118742r(56.0f);
            this.f60640Q = m118742r5;
            int m118742r6 = AbstractC23136l9.m118742r(56.0f);
            this.f60641R = m118742r6;
            int m118742r7 = AbstractC23136l9.m118742r(16.0f);
            this.f60642S = m118742r7;
            int m118742r8 = AbstractC23136l9.m118742r(8.0f);
            this.f60643T = m118742r8;
            int m118742r9 = AbstractC23136l9.m118742r(16.0f);
            this.f60644U = m118742r9;
            int m118742r10 = AbstractC23136l9.m118742r(10.0f);
            this.f60645V = m118742r10;
            int m118759w12 = AbstractC23136l9.m118759w1(12);
            this.f60646W = m118759w12;
            int m118742r11 = AbstractC23136l9.m118742r(13.0f);
            this.f60647a0 = m118742r11;
            this.f60657k0 = "";
            this.f60659m0 = "";
            this.f60652f0 = new C3977j(context);
            this.f60658l0 = new StyleSpan(1);
            setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            C13704p1 c13704p1 = new C13704p1(1);
            this.f60656j0 = c13704p1;
            c13704p1.setTextSize(m118759w1);
            C21691a c21691a = new C21691a(context);
            this.f60654h0 = c21691a;
            C16718f m89027K = c21691a.m89106L().m89060k0(m118742r3).m89030N(m118742r3).m89032P(m118742r4, 0, 0, 0).m89027K(true);
            Boolean bool = Boolean.TRUE;
            m89027K.m89073z(bool);
            c21691a.m111906k1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_unchecked));
            c21691a.m111905j1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_checked));
            c21691a.mo89099H0(false);
            mo69681L(c21691a);
            C21693c c21693c = new C21693c(context);
            this.f60648b0 = c21693c;
            c21693c.m89106L().m89060k0(m118742r5).m89030N(m118742r5).m89032P(m118742r7, m118742r8, m118742r7, m118742r8).m89054h0(c21691a);
            mo69681L(c21693c);
            C21693c c21693c2 = new C21693c(context);
            this.f60655i0 = c21693c2;
            c21693c2.m89106L().m89060k0(m118742r6).m89030N(m118742r6).m89042Z(m118742r9, m118742r9, m118742r9, m118742r9).m89071x(c21693c).m89020D(c21693c);
            c21693c2.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_play));
            mo69681L(c21693c2);
            C16716d c16716d = new C16716d(context);
            this.f60653g0 = c16716d;
            c16716d.m89106L().m89028L(-1, -2).m89035S(m118742r10).m89054h0(c21693c).m89017A(bool).m89027K(true);
            C11660a c11660a = new C11660a(context, FileSelectAdapter.this);
            this.f60649c0 = c11660a;
            c11660a.m89106L().m89028L(-2, -2).m89073z(bool);
            c11660a.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c11660a.mo111964L1(m118759w1);
            c11660a.m111953A1(1);
            c16716d.m89001g1(c11660a);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f60650d0 = c22126c0;
            c22126c0.m89106L().m89028L(-2, -2).m89023G(c11660a).m89036T(m118742r2);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            c22126c0.mo111964L1(m118759w12);
            c22126c0.m111953A1(1);
            c22126c0.m111957E1(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            c16716d.m89001g1(c22126c0);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f60651e0 = c22126c02;
            c22126c02.m89106L().m89028L(-2, -2).m89023G(c11660a).m89036T(m118742r).m89017A(bool);
            c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            c22126c02.mo111964L1(m118742r11);
            c22126c02.m111953A1(1);
            c22126c02.m111957E1(true);
            c22126c02.m111980v1(truncateAt);
            c16716d.m89001g1(c22126c02);
            mo69681L(c16716d);
        }

        /* renamed from: g0 */
        private boolean m64987g0(FileSelectView.C11672g c11672g) {
            String str;
            String str2 = c11672g.f60743f;
            if (str2 != null && !TextUtils.isEmpty(str2) && (str = c11672g.f60744g) != null && !c11672g.f60743f.equals(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: h0 */
        private void m64988h0(FileSelectView.C11672g c11672g, int i11, boolean z11) {
            String str = c11672g.f60743f;
            C24003n c24003n = new C24003n();
            c24003n.f116275p = true;
            c24003n.f116276q = true;
            c24003n.f116263d = true;
            c24003n.f116266g = C23278z2.m120110a();
            if (m64987g0(c11672g)) {
                c24003n.f116260a = AbstractC23006a0.m117883M();
            } else {
                c24003n.f116260a = this.f60636M;
            }
            if (str != null && !TextUtils.isEmpty(str)) {
                if (C23999j.m125696L2(str, c24003n)) {
                    C3979l m123606l = FileSelectAdapter.this.f60607t.m123606l(str, c24003n.f116260a, c24003n.f116263d, c24003n.f116266g);
                    if (m123606l != null) {
                        this.f60652f0.setImageInfo(m123606l);
                        this.f60648b0.mo111924u1(m123606l.m18839c());
                        if (i11 == AbstractC23322a.zds_ffic_mov_colored_48) {
                            this.f60655i0.mo44614b1(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                long j11 = c11672g.f60745h;
                C21693c c21693c = this.f60648b0;
                c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.gray_rounded_corner_file_thumb));
                if (!z11) {
                    ((C23528a) FileSelectAdapter.this.f60607t.m123612r(this.f60652f0)).m123579C(str, c24003n, new C11661b(j11, i11));
                }
            }
        }

        /* renamed from: f0 */
        public void m64989f0(FileSelectView.C11672g c11672g) {
            this.f60654h0.m111904i1(c11672g.f60755r, false);
        }

        @Override // com.zing.zalo.ui.chat.picker.file.FileSelectAdapter.FileItemModulesView, com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter.InterfaceC11663a
        /* renamed from: u */
        public void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11) {
            try {
                this.f60649c0.m111959G1("");
                this.f60659m0 = c11672g.f60743f;
                ArrayList arrayList = c11672g.f60749l;
                if (arrayList != null && !arrayList.isEmpty()) {
                    SpannableString spannableString = new SpannableString(c11672g.f60740c.trim());
                    for (int i12 = 0; i12 < c11672g.f60749l.size() - 1; i12 += 2) {
                        try {
                            if (((Integer) c11672g.f60749l.get(i12)).intValue() >= 0) {
                                int i13 = i12 + 1;
                                if (((Integer) c11672g.f60749l.get(i13)).intValue() > ((Integer) c11672g.f60749l.get(i12)).intValue()) {
                                    spannableString.setSpan(this.f60658l0, ((Integer) c11672g.f60749l.get(i12)).intValue(), ((Integer) c11672g.f60749l.get(i13)).intValue(), 33);
                                }
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                    }
                    this.f60657k0 = spannableString.subSequence(0, spannableString.length());
                } else {
                    this.f60657k0 = c11672g.f60740c.trim();
                }
                if (!TextUtils.isEmpty(c11672g.f60741d)) {
                    this.f60650d0.m111959G1(c11672g.f60741d);
                    this.f60650d0.mo44614b1(0);
                } else {
                    this.f60650d0.mo44614b1(8);
                }
                String str = c11672g.f60742e;
                int m142203n = AbstractC28236y3.m142203n(str.substring(0, Math.min(str.length(), 4)));
                this.f60655i0.mo44614b1(8);
                if ((m142203n == AbstractC23322a.zds_ffic_mov_colored_48 && m64987g0(c11672g)) || m142203n == AbstractC23322a.zds_ffic_image_colored_48) {
                    this.f60648b0.m111929z1(5);
                    this.f60648b0.mo111927x1(25.0f);
                    m64988h0(c11672g, m142203n, FileSelectAdapter.this.f60608u);
                } else {
                    C21693c c21693c = this.f60648b0;
                    c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), m142203n));
                    this.f60648b0.m111929z1(0);
                    this.f60648b0.mo111927x1(0.0f);
                }
                this.f60654h0.m111904i1(c11672g.f60755r, false);
                this.f60651e0.mo44614b1(0);
                this.f60651e0.m111959G1(AbstractC23160o0.m119201K(c11672g.f60745h));
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    public class ItemInlineBanner extends FileItemModulesView {

        /* renamed from: K */
        private final int f60666K;

        /* renamed from: L */
        private final int f60667L;

        /* renamed from: M */
        private final int f60668M;

        /* renamed from: N */
        private final int f60669N;

        /* renamed from: O */
        private final int f60670O;

        /* renamed from: P */
        private final int f60671P;

        /* renamed from: Q */
        private final C22126c0 f60672Q;

        /* renamed from: R */
        private final C21693c f60673R;

        /* renamed from: S */
        private final C3977j f60674S;

        /* renamed from: T */
        private int f60675T;

        /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$ItemInlineBanner$a */
        /* loaded from: classes5.dex */
        class C11662a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ String f60677l1;

            C11662a(String str) {
                this.f60677l1 = str;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                if (str != null && !TextUtils.isEmpty(str) && this.f60677l1.equals(str) && c3979l != null && c3979l.m18839c() != null) {
                    ItemInlineBanner.this.f60674S.setImageInfo(c3979l, false);
                    ItemInlineBanner.this.f60673R.mo111924u1(c3979l.m18839c());
                }
            }
        }

        public ItemInlineBanner(Context context) {
            super(context);
            int m118742r = AbstractC23136l9.m118742r(24.0f);
            this.f60666K = m118742r;
            int m118742r2 = AbstractC23136l9.m118742r(3.0f);
            this.f60667L = m118742r2;
            int m118742r3 = AbstractC23136l9.m118742r(3.0f);
            this.f60668M = m118742r3;
            int m118742r4 = AbstractC23136l9.m118742r(15.0f);
            this.f60669N = m118742r4;
            int m118742r5 = AbstractC23136l9.m118742r(6.0f);
            this.f60670O = m118742r5;
            int m118759w1 = AbstractC23136l9.m118759w1(13);
            this.f60671P = m118759w1;
            this.f60675T = 0;
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.f60674S = new C3977j(context);
            C21693c c21693c = new C21693c(context);
            this.f60673R = c21693c;
            C16718f m89032P = c21693c.m89106L().m89060k0(m118742r).m89030N(m118742r).m89041Y(m118742r2).m89032P(0, m118742r3, m118742r3, 0);
            Boolean bool = Boolean.TRUE;
            m89032P.m89018B(bool).m89017A(bool);
            c21693c.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_close_botadv_w));
            c21693c.mo89109M0(new C16719g.c() { // from class: f60.a
                public /* synthetic */ C18784a() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FileSelectAdapter.ItemInlineBanner.this.m64995Y(c16719g);
                }
            });
            mo69681L(c21693c);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f60672Q = c22126c0;
            c22126c0.m89106L().m89049e0(c21693c).m89032P(m118742r4, m118742r5, m118742r4, m118742r5).m89018B(bool).m89073z(bool);
            c22126c0.mo111964L1(m118759w1);
            c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            mo69681L(c22126c0);
        }

        /* renamed from: Y */
        public /* synthetic */ void m64995Y(C16719g c16719g) {
            FileSelectAdapter.this.f60611x.remove(0);
            FileSelectAdapter.this.m10017y(0);
            C23343a.m122749b(FileSelectAdapter.this.f60610w, 2, this.f60675T);
        }

        @Override // com.zing.zalo.ui.chat.picker.file.FileSelectAdapter.FileItemModulesView, com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter.InterfaceC11663a
        /* renamed from: u */
        public void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11) {
            int i12;
            try {
                this.f60675T = c11672g.f60754q;
                setBackgroundColor(c11672g.f60751n);
                this.f60672Q.m111959G1(c11672g.f60740c);
                this.f60672Q.m111962J1(c11672g.f60752o);
                String str = c11672g.f60753p;
                if (str != null && !TextUtils.isEmpty(str)) {
                    C24003n c24003n = new C24003n();
                    c24003n.f116275p = true;
                    c24003n.f116260a = this.f60666K;
                    ((C23528a) FileSelectAdapter.this.f60607t.m123612r(this.f60674S)).m123579C(c11672g.f60753p, c24003n, new C11662a(c11672g.f60753p));
                }
                C21693c c21693c = this.f60673R;
                if (c11672g.f60750m == 1) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                c21693c.mo44614b1(i12);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class SectionHeaderView extends FileItemModulesView {

        /* renamed from: K */
        private final int f60679K;

        /* renamed from: L */
        private final int f60680L;

        /* renamed from: M */
        private final int f60681M;

        /* renamed from: N */
        private final int f60682N;

        /* renamed from: O */
        private final C22126c0 f60683O;

        public SectionHeaderView(Context context) {
            super(context);
            int m118742r = AbstractC23136l9.m118742r(8.0f);
            this.f60679K = m118742r;
            int m118742r2 = AbstractC23136l9.m118742r(16.0f);
            this.f60680L = m118742r2;
            int m118742r3 = AbstractC23136l9.m118742r(14.0f);
            this.f60681M = m118742r3;
            int m118759w1 = AbstractC23136l9.m118759w1(13);
            this.f60682N = m118759w1;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            C16719g c16719g = new C16719g(context);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
            c16719g.m89106L().m89028L(-1, m118742r).m89018B(Boolean.TRUE);
            mo69681L(c16719g);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f60683O = c22126c0;
            c22126c0.m89106L().m89023G(c16719g).m89032P(m118742r2, m118742r3, m118742r2, m118742r3);
            c22126c0.mo111964L1(m118759w1);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.mo111965M1(1);
            c22126c0.m111953A1(1);
            c22126c0.m111957E1(true);
            mo69681L(c22126c0);
        }

        @Override // com.zing.zalo.ui.chat.picker.file.FileSelectAdapter.FileItemModulesView, com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter.InterfaceC11663a
        /* renamed from: u */
        public void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11) {
            try {
                this.f60683O.m111959G1(c11672g.f60740c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11663a {
        /* renamed from: u */
        void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$b */
    /* loaded from: classes5.dex */
    public class C11664b extends AbstractC11665c {

        /* renamed from: I */
        private final FileItemModulesView f60684I;

        public C11664b(FileItemModulesView fileItemModulesView) {
            super(fileItemModulesView);
            this.f60684I = fileItemModulesView;
        }

        @Override // com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter.AbstractC11665c
        /* renamed from: i0 */
        public void mo64996i0(int i11) {
            try {
                FileSelectView.C11672g c11672g = (FileSelectView.C11672g) FileSelectAdapter.this.f60611x.get(i11);
                if (c11672g.f60738a == 5) {
                    ((FileView) this.f60684I).m64989f0(c11672g);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.picker.file.FileSelectAdapter.InterfaceC11663a
        /* renamed from: u */
        public void mo64975u(FileSelectView.C11672g c11672g, int i11, boolean z11) {
            try {
                this.f60684I.mo64975u(c11672g, i11, z11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.file.FileSelectAdapter$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11665c extends RecyclerView.AbstractC1876c0 implements InterfaceC11663a {
        public AbstractC11665c(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo64996i0(int i11);
    }

    public FileSelectAdapter(Context context, C23528a c23528a, C21275a c21275a) {
        this.f60606s = context;
        this.f60607t = c23528a;
        this.f60610w = c21275a;
    }

    /* renamed from: O */
    public ArrayList m64968O() {
        return this.f60611x;
    }

    /* renamed from: P */
    public FileSelectView.C11672g m64969P(int i11) {
        return (FileSelectView.C11672g) this.f60611x.get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q */
    public void mo9990A(AbstractC11665c abstractC11665c, int i11) {
        mo9991B(abstractC11665c, i11, new ArrayList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R */
    public void mo9991B(AbstractC11665c abstractC11665c, int i11, List list) {
        if (abstractC11665c.m9929A() > this.f60609v) {
            abstractC11665c.f7784p.startAnimation(AnimationUtils.loadAnimation(this.f60606s, AbstractC10919t.fade_in_short));
            this.f60609v = abstractC11665c.m9929A();
        }
        if (list.size() != 0) {
            if ((list.get(0) instanceof Integer) && ((Integer) list.get(0)).intValue() == 0) {
                abstractC11665c.mo64996i0(i11);
                return;
            }
            return;
        }
        abstractC11665c.mo64975u((FileSelectView.C11672g) this.f60611x.get(i11), i11, this.f60608u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S */
    public AbstractC11665c mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 0) {
            switch (i11) {
                case 2:
                    return new C11664b(new SectionHeaderView(this.f60606s));
                case 3:
                case 4:
                    return new C11664b(new CustomFolderView(this.f60606s));
                case 5:
                    return new C11664b(new FileView(this.f60606s));
                case 6:
                    return new C11664b(new EmptySearchView(this.f60606s));
                case 7:
                    return new C11664b(new FakeBottomView(this.f60606s));
                default:
                    return new C11664b(new BaseFolderView(this.f60606s));
            }
        }
        return new C11664b(new ItemInlineBanner(this.f60606s));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: T */
    public void mo9996G(AbstractC11665c abstractC11665c) {
        abstractC11665c.f7784p.clearAnimation();
        super.mo9996G(abstractC11665c);
    }

    /* renamed from: U */
    public void m64974U(ArrayList arrayList, boolean z11) {
        this.f60611x = new ArrayList(arrayList);
        if (z11) {
            this.f60609v = -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f60611x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((FileSelectView.C11672g) this.f60611x.get(i11)).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((FileSelectView.C11672g) this.f60611x.get(i11)).m65081a();
    }
}
