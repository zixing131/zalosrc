package com.zing.zalo.p077ui.backuprestore.intro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import c50.C3297h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.data.backuprestore.model.media.BackupCloudInfo;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.backuprestore.drive.ManageGoogleAccountView;
import com.zing.zalo.p077ui.backuprestore.intro.BackupRestoreIntroView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import java.util.Arrays;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p227i3.C20218v;
import p320ld.C22438j;
import p320ld.C22441m;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p387oc.C24213q;
import p421pc.C24720a;
import p542ub.InterfaceC27218a;
import p649xl.C30080v4;
import p716zh.C31986k3;
import si.C26263i;
import tg0.C26676b;
import ui0.C27280g;
import zl0.AbstractC32226c;

/* loaded from: classes5.dex */
public final class BackupRestoreIntroView extends SlidableZaloView implements View.OnClickListener {
    public static final C11108a Companion = new C11108a(null);

    /* renamed from: P0 */
    private C30080v4 f55937P0;

    /* renamed from: Q0 */
    private int f55938Q0 = 1;

    /* renamed from: R0 */
    private TargetBackupInfo f55939R0;

    /* renamed from: S0 */
    private boolean f55940S0;

    /* renamed from: T0 */
    private int f55941T0;

    /* renamed from: com.zing.zalo.ui.backuprestore.intro.BackupRestoreIntroView$a */
    /* loaded from: classes5.dex */
    public static final class C11108a {
        private C11108a() {
        }

        public /* synthetic */ C11108a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.intro.BackupRestoreIntroView$b */
    /* loaded from: classes5.dex */
    public static final class C11109b extends ClickableSpan {
        C11109b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            BackupRestoreIntroView.this.m57990rM();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: AM */
    private final void m57977AM() {
        this.f55941T0 = 1;
        C30080v4 c30080v4 = this.f55937P0;
        C30080v4 c30080v42 = null;
        if (c30080v4 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v4 = null;
        }
        c30080v4.f139635D.setBackground(null);
        m57988pM();
        C30080v4 c30080v43 = this.f55937P0;
        if (c30080v43 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v43 = null;
        }
        RobotoTextView robotoTextView = c30080v43.f139644M;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.text_header_backup_img_into_n_day_newest);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(C24720a.Companion.m128432a().m128413h())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        C30080v4 c30080v44 = this.f55937P0;
        if (c30080v44 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v44 = null;
        }
        c30080v44.f139643L.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_intro_setup_backup_media_permission_contact));
        C30080v4 c30080v45 = this.f55937P0;
        if (c30080v45 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v45 = null;
        }
        c30080v45.f139647r.setVisibility(8);
        C30080v4 c30080v46 = this.f55937P0;
        if (c30080v46 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v46 = null;
        }
        c30080v46.f139646q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_intro_setup_backup_btn_continue));
        C30080v4 c30080v47 = this.f55937P0;
        if (c30080v47 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v47 = null;
        }
        c30080v47.f139646q.setTag(Boolean.FALSE);
        C30080v4 c30080v48 = this.f55937P0;
        if (c30080v48 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v48 = null;
        }
        c30080v48.f139642K.setVisibility(8);
        C30080v4 c30080v49 = this.f55937P0;
        if (c30080v49 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v49 = null;
        }
        c30080v49.f139640I.setVisibility(0);
        C30080v4 c30080v410 = this.f55937P0;
        if (c30080v410 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v410 = null;
        }
        RobotoTextView robotoTextView2 = c30080v410.f139641J;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.text_content_description_what_app_backup);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        String format2 = String.format(m118743r02, Arrays.copyOf(new Object[]{100}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        robotoTextView2.setText(format2);
        C30080v4 c30080v411 = this.f55937P0;
        if (c30080v411 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30080v42 = c30080v411;
        }
        c30080v42.f139649t.setOnClickListener(this);
        m57978BM();
    }

    /* renamed from: BM */
    private final void m57978BM() {
        String m118743r0;
        int m127173b0;
        String m127114D;
        C30080v4 c30080v4 = null;
        if (C31986k3.f147083a.m154111U1()) {
            C30080v4 c30080v42 = this.f55937P0;
            if (c30080v42 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30080v4 = c30080v42;
            }
            c30080v4.f139637F.setVisibility(8);
            return;
        }
        if (AbstractC23306f.m120692n().m133023A()) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setup_backup_msg_desc_include_e2ee_thread_v2);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setup_backup_msg_desc_exclude_e2ee_thread_v2);
        }
        AbstractC19074t.m100205c(m118743r0);
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#x#", 0, false, 6, null);
        if (m127173b0 >= 0) {
            C11109b c11109b = new C11109b();
            C30080v4 c30080v43 = this.f55937P0;
            if (c30080v43 == null) {
                AbstractC19074t.m100223u("binding");
                c30080v43 = null;
            }
            RobotoTextView robotoTextView = c30080v43.f139651v;
            m127114D = AbstractC24341v.m127114D(m118743r0, "#x#", "", false, 4, null);
            SpannableString spannableString = new SpannableString(m127114D);
            spannableString.setSpan(c11109b, m127173b0, spannableString.length(), 33);
            C30080v4 c30080v44 = this.f55937P0;
            if (c30080v44 == null) {
                AbstractC19074t.m100223u("binding");
                c30080v44 = null;
            }
            spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(c30080v44.f139651v.getContext(), AbstractC2807a.button_tertiary_text)), m127173b0, spannableString.length(), 33);
            robotoTextView.setText(spannableString);
            C30080v4 c30080v45 = this.f55937P0;
            if (c30080v45 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30080v4 = c30080v45;
            }
            c30080v4.f139651v.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        C30080v4 c30080v46 = this.f55937P0;
        if (c30080v46 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30080v4 = c30080v46;
        }
        c30080v4.f139651v.setText(m118743r0);
    }

    /* renamed from: lM */
    private final void m57984lM() {
        boolean m135011D0 = C26263i.m135011D0(this.f55938Q0, this.f55939R0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_go_to_force_set_pass", m135011D0);
        bundle.putInt("extra_entry_point", this.f55938Q0);
        TargetBackupInfo targetBackupInfo = this.f55939R0;
        if (targetBackupInfo != null && targetBackupInfo.isValid()) {
            bundle.putParcelable("extra_cloud_info", new BackupCloudInfo(targetBackupInfo.m40959o(), targetBackupInfo.m40962t(), targetBackupInfo.m40957m()));
        }
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ManageGoogleAccountView.class, bundle, 18061, 1, true);
        }
    }

    /* renamed from: mM */
    private final void m57985mM() {
        C30080v4 c30080v4 = this.f55937P0;
        C30080v4 c30080v42 = null;
        if (c30080v4 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v4 = null;
        }
        Context context = getContext();
        if (context != null) {
            if (C23212s8.m119601h() == 1) {
                c30080v4.f139654y.setImageDrawable(AbstractC1388a.m6964f(context, AbstractC16803z.ic_backup_restore_intro_message_dark));
            } else {
                c30080v4.f139654y.setImageDrawable(AbstractC1388a.m6964f(context, AbstractC16803z.ic_backup_restore_intro_message));
            }
            C30080v4 c30080v43 = this.f55937P0;
            if (c30080v43 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30080v42 = c30080v43;
            }
            ZAppCompatImageView zAppCompatImageView = c30080v42.f139633B;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_solid_24, AbstractC2807a.accent_blue_icon));
        }
        m57988pM();
    }

    /* renamed from: nM */
    private final void m57986nM() {
        C30080v4 c30080v4 = this.f55937P0;
        if (c30080v4 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v4 = null;
        }
        c30080v4.f139655z.setVisibility(8);
        RobotoTextView robotoTextView = c30080v4.f139652w;
        C24213q m126205a = C24213q.Companion.m126205a();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        robotoTextView.setText(m126205a.m126202r(m92689tK));
        c30080v4.f139635D.setVisibility(8);
        c30080v4.f139638G.setVisibility(8);
        c30080v4.f139653x.setVisibility(0);
        c30080v4.f139632A.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(0);
        c30080v4.f139651v.setLayoutParams(layoutParams);
        LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-1, -2);
        layoutParams2.setMarginStart(0);
        c30080v4.f139652w.setLayoutParams(layoutParams2);
        m57978BM();
    }

    /* renamed from: oM */
    private final void m57987oM() {
        Drawable m6964f;
        C30080v4 c30080v4 = this.f55937P0;
        C30080v4 c30080v42 = null;
        if (c30080v4 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v4 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c30080v4.f139634C;
        if (C23212s8.m119601h() == 1) {
            C30080v4 c30080v43 = this.f55937P0;
            if (c30080v43 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30080v42 = c30080v43;
            }
            m6964f = AbstractC1388a.m6964f(c30080v42.f139634C.getContext(), AbstractC16803z.ic_backup_restore_intro_photo_warning_dark);
        } else {
            C30080v4 c30080v44 = this.f55937P0;
            if (c30080v44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30080v42 = c30080v44;
            }
            m6964f = AbstractC1388a.m6964f(c30080v42.f139634C.getContext(), AbstractC16803z.ic_backup_restore_intro_photo_warning);
        }
        zAppCompatImageView.setImageDrawable(m6964f);
    }

    /* renamed from: pM */
    private final void m57988pM() {
        Drawable m6964f;
        C30080v4 c30080v4 = this.f55937P0;
        C30080v4 c30080v42 = null;
        if (c30080v4 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v4 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c30080v4.f139634C;
        if (C23212s8.m119601h() == 1) {
            C30080v4 c30080v43 = this.f55937P0;
            if (c30080v43 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30080v42 = c30080v43;
            }
            m6964f = AbstractC1388a.m6964f(c30080v42.f139634C.getContext(), AbstractC16803z.ic_backup_restore_intro_photo_dark);
        } else {
            C30080v4 c30080v44 = this.f55937P0;
            if (c30080v44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30080v42 = c30080v44;
            }
            m6964f = AbstractC1388a.m6964f(c30080v42.f139634C.getContext(), AbstractC16803z.ic_backup_restore_intro_photo);
        }
        zAppCompatImageView.setImageDrawable(m6964f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m57989qM(BackupRestoreIntroView backupRestoreIntroView) {
        AbstractC19074t.m100208f(backupRestoreIntroView, "this$0");
        backupRestoreIntroView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public final void m57990rM() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 28);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1, true);
        }
    }

    /* renamed from: sM */
    private final void m57991sM() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 27);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1, true);
        }
    }

    /* renamed from: tM */
    private final void m57992tM() {
        if ((AbstractC3489d.m17501i() || AbstractC3489d.m17512t()) && C22447s.f109797a.m116077t0()) {
            m57986nM();
            return;
        }
        try {
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (!C22441m.m115982a(baseZaloView) && this.f55940S0) {
                m57998zM();
            } else {
                m57977AM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: uM */
    private final void m57993uM() {
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        final Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_CREATE_PROTECTION_CODE", true);
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        if (m57112d != null) {
            m57112d.runOnUiThread(new Runnable() { // from class: w40.d
                @Override // java.lang.Runnable
                public final void run() {
                    BackupRestoreIntroView.m57994vM(BackupRestoreIntroView.this, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m57994vM(BackupRestoreIntroView backupRestoreIntroView, Bundle bundle) {
        AbstractC19074t.m100208f(backupRestoreIntroView, "this$0");
        AbstractC19074t.m100208f(bundle, "$extras");
        try {
            C17487o0 m92662fJ = backupRestoreIntroView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    /* renamed from: wM */
    private final void m57995wM() {
        C22447s.m115999E0(C22447s.f109797a, m92676n2(), new InterfaceC17463d.d() { // from class: w40.b
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                BackupRestoreIntroView.m57996xM(BackupRestoreIntroView.this, interfaceC17463d, i11);
            }
        }, null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m57996xM(final BackupRestoreIntroView backupRestoreIntroView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(backupRestoreIntroView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        backupRestoreIntroView.f72827B0.post(new Runnable() { // from class: w40.c
            @Override // java.lang.Runnable
            public final void run() {
                BackupRestoreIntroView.m57997yM(BackupRestoreIntroView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m57997yM(BackupRestoreIntroView backupRestoreIntroView) {
        AbstractC19074t.m100208f(backupRestoreIntroView, "this$0");
        backupRestoreIntroView.m57992tM();
    }

    /* renamed from: zM */
    private final void m57998zM() {
        if (this.f55941T0 == 2) {
            return;
        }
        this.f55941T0 = 2;
        C30080v4 c30080v4 = this.f55937P0;
        C30080v4 c30080v42 = null;
        if (c30080v4 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v4 = null;
        }
        LinearLayout linearLayout = c30080v4.f139635D;
        C30080v4 c30080v43 = this.f55937P0;
        if (c30080v43 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v43 = null;
        }
        linearLayout.setBackground(AbstractC23136l9.m118665N(c30080v43.getRoot().getContext(), AbstractC16803z.bg_rectangle_cor_8_col_support_warning_page));
        m57987oM();
        C30080v4 c30080v44 = this.f55937P0;
        if (c30080v44 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v44 = null;
        }
        c30080v44.f139644M.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_intro_setup_backup_media_permission_contact_deny_title_v2));
        C30080v4 c30080v45 = this.f55937P0;
        if (c30080v45 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v45 = null;
        }
        c30080v45.f139642K.setVisibility(0);
        C30080v4 c30080v46 = this.f55937P0;
        if (c30080v46 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v46 = null;
        }
        c30080v46.f139643L.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_intro_setup_backup_media_permission_contact_deny_desc_v2));
        C30080v4 c30080v47 = this.f55937P0;
        if (c30080v47 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v47 = null;
        }
        c30080v47.f139647r.setVisibility(0);
        C30080v4 c30080v48 = this.f55937P0;
        if (c30080v48 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v48 = null;
        }
        c30080v48.f139647r.setOnClickListener(this);
        C30080v4 c30080v49 = this.f55937P0;
        if (c30080v49 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v49 = null;
        }
        c30080v49.f139646q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_intro_setup_backup_action_backup_msg_only));
        C30080v4 c30080v410 = this.f55937P0;
        if (c30080v410 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v410 = null;
        }
        c30080v410.f139646q.setTag(Boolean.TRUE);
        C30080v4 c30080v411 = this.f55937P0;
        if (c30080v411 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30080v42 = c30080v411;
        }
        c30080v42.f139640I.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f55938Q0 = m92642L3.getInt("extra_entry_point", this.f55938Q0);
            this.f55939R0 = (TargetBackupInfo) m92642L3.getParcelable("extra_target_backup_info");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30080v4 m148605c = C30080v4.m148605c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148605c, "inflate(...)");
        this.f55937P0 = m148605c;
        if (m148605c == null) {
            AbstractC19074t.m100223u("binding");
            m148605c = null;
        }
        FrameLayout root = m148605c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m57985mM();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f55941T0 = 0;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C30080v4 c30080v4 = this.f55937P0;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c30080v4 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v4 = null;
        }
        c30080v4.f139646q.setOnClickListener(this);
        C30080v4 c30080v42 = this.f55937P0;
        if (c30080v42 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v42 = null;
        }
        c30080v42.f139650u.setOnClickListener(this);
        C30080v4 c30080v43 = this.f55937P0;
        if (c30080v43 == null) {
            AbstractC19074t.m100223u("binding");
            c30080v43 = null;
        }
        ViewGroup.LayoutParams layoutParams = c30080v43.f139650u.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
                marginLayoutParams.topMargin = AbstractC23222t7.f112556e + AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
            } else {
                marginLayoutParams.topMargin = AbstractC23222t7.f112556e;
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BackupRestoreIntroView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 != 18053) {
            if (i11 == 18061 && i12 == -1) {
                C3297h.f14104a.m16744l(m92656bJ());
                mo50035CK(-1, intent);
                finish();
                return;
            }
            return;
        }
        if (i12 == -1) {
            C3297h.f14104a.m16744l(m92656bJ());
            mo50035CK(-1, intent);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_continue) {
            if ((AbstractC3489d.m17501i() || AbstractC3489d.m17512t()) && C22447s.f109797a.m116077t0()) {
                if (!AbstractC23306f.m120668h().m132668G() && AbstractC3489d.m17512t()) {
                    m57993uM();
                    return;
                }
                C23744a.Companion.m124119a().m124116d(150812, new Object[0]);
                AbstractC23350e.m122772b("Fire EVENT_REFRESH_BACKUP_DETAIL bkd", new Object[0]);
                mo50035CK(-1, null);
                AbstractC19444a.m101694b(new Runnable() { // from class: w40.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BackupRestoreIntroView.m57989qM(BackupRestoreIntroView.this);
                    }
                }, 500L);
                AbstractC23350e.m122772b("EVENT_REFRESH_BACKUP_DETAIL finish", new Object[0]);
                return;
            }
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView)) {
                m57984lM();
                return;
            }
            C30080v4 c30080v4 = this.f55937P0;
            if (c30080v4 == null) {
                AbstractC19074t.m100223u("binding");
                c30080v4 = null;
            }
            if (c30080v4.f139646q.getTag() != null) {
                C30080v4 c30080v42 = this.f55937P0;
                if (c30080v42 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30080v42 = null;
                }
                Object tag = c30080v42.f139646q.getTag();
                AbstractC19074t.m100206d(tag, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) tag).booleanValue()) {
                    C22438j c22438j = C22438j.f109770a;
                    C17487o0 mo35579p = m92692wK().mo35579p();
                    AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
                    if (!c22438j.m115957b(mo35579p, this.f55938Q0, this.f55939R0, false)) {
                        mo50035CK(-1, null);
                        finish();
                        return;
                    }
                    return;
                }
            }
            BaseZaloView baseZaloView2 = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView2, "mThis");
            C22441m.m115984c(baseZaloView2, 0, 2, null);
            return;
        }
        if (id2 == AbstractC6918a0.close) {
            mo50035CK(0, null);
            finish();
        } else if (id2 == AbstractC6918a0.btn_grant_permission) {
            BaseZaloView baseZaloView3 = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView3, "mThis");
            C22441m.m115984c(baseZaloView3, 0, 2, null);
        } else if (id2 == AbstractC6918a0.btn_more_detail_data_zalo_backup) {
            m57991sM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 150) {
            this.f55940S0 = true;
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView)) {
                m57984lM();
                return;
            }
            Context m92648SI = this.f72421L0.m92648SI();
            AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type android.app.Activity");
            if (!AbstractC23034c6.m118111A0((Activity) m92648SI, "android.permission.READ_CONTACTS")) {
                if (!AbstractC23034c6.m118132R("android.permission.READ_CONTACTS")) {
                    m57995wM();
                    return;
                } else {
                    m57998zM();
                    return;
                }
            }
            m57998zM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m57992tM();
    }
}
