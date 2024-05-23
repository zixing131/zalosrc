package com.zing.zalo.p077ui.backuprestore.encryption.setup;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.BackupKeySetupView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseSetupZaloCloudView;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hc0.EnumC19985o;
import java.util.NoSuchElementException;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import p649xl.AbstractC29935n;
import tg0.C26676b;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class BackupKeySetupView extends BaseSetupZaloCloudView<AbstractC29935n> {
    public static final C11020a Companion = new C11020a(null);

    /* renamed from: U0 */
    private EnumC11021b f55685U0 = EnumC11021b.f55686q;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.BackupKeySetupView$a */
    /* loaded from: classes5.dex */
    public static final class C11020a {
        private C11020a() {
        }

        public /* synthetic */ C11020a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.BackupKeySetupView$b */
    /* loaded from: classes5.dex */
    public static final class EnumC11021b {
        public static final a Companion;

        /* renamed from: q */
        public static final EnumC11021b f55686q = new EnumC11021b(Image.SCALE_TYPE_NONE, 0, 0);

        /* renamed from: r */
        public static final EnumC11021b f55687r = new EnumC11021b("PASSWORD", 1, 1);

        /* renamed from: s */
        public static final EnumC11021b f55688s = new EnumC11021b("SECRET_PHRASE", 2, 2);

        /* renamed from: t */
        private static final /* synthetic */ EnumC11021b[] f55689t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f55690u;

        /* renamed from: p */
        private final int f55691p;

        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.BackupKeySetupView$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final EnumC11021b m57580a(int i11) {
                for (EnumC11021b enumC11021b : EnumC11021b.values()) {
                    if (enumC11021b.m57579c() == i11) {
                        return enumC11021b;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        static {
            EnumC11021b[] m57578b = m57578b();
            f55689t = m57578b;
            f55690u = AbstractC30166b.m148796a(m57578b);
            Companion = new a(null);
        }

        private EnumC11021b(String str, int i11, int i12) {
            this.f55691p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC11021b[] m57578b() {
            return new EnumC11021b[]{f55686q, f55687r, f55688s};
        }

        public static EnumC11021b valueOf(String str) {
            return (EnumC11021b) Enum.valueOf(EnumC11021b.class, str);
        }

        public static EnumC11021b[] values() {
            return (EnumC11021b[]) f55689t.clone();
        }

        /* renamed from: c */
        public final int m57579c() {
            return this.f55691p;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.BackupKeySetupView$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11022c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55692a;

        static {
            int[] iArr = new int[EnumC11021b.values().length];
            try {
                iArr[EnumC11021b.f55686q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11021b.f55687r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11021b.f55688s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55692a = iArr;
        }
    }

    /* renamed from: BM */
    private final void m57569BM(EnumC11021b enumC11021b) {
        this.f55685U0 = enumC11021b;
        int i11 = C11022c.f55692a[enumC11021b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    ((AbstractC29935n) m77756kM()).f138733S.setBackgroundResource(AbstractC16803z.bg_card_non_select);
                    ((AbstractC29935n) m77756kM()).f138734T.setBackgroundResource(AbstractC16803z.bg_card_selected);
                    ((AbstractC29935n) m77756kM()).f138730P.setEnabled(true);
                    return;
                }
                return;
            }
            ((AbstractC29935n) m77756kM()).f138733S.setBackgroundResource(AbstractC16803z.bg_card_selected);
            ((AbstractC29935n) m77756kM()).f138734T.setBackgroundResource(AbstractC16803z.bg_card_non_select);
            ((AbstractC29935n) m77756kM()).f138730P.setEnabled(true);
            return;
        }
        ((AbstractC29935n) m77756kM()).f138733S.setBackgroundResource(AbstractC16803z.bg_card_non_select);
        ((AbstractC29935n) m77756kM()).f138734T.setBackgroundResource(AbstractC16803z.bg_card_non_select);
        ((AbstractC29935n) m77756kM()).f138730P.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m57570CM(BackupKeySetupView backupKeySetupView, View view) {
        AbstractC19074t.m100208f(backupKeySetupView, "this$0");
        backupKeySetupView.m57569BM(EnumC11021b.f55687r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m57571DM(BackupKeySetupView backupKeySetupView, View view) {
        AbstractC19074t.m100208f(backupKeySetupView, "this$0");
        backupKeySetupView.m57569BM(EnumC11021b.f55688s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m57572EM(BackupKeySetupView backupKeySetupView, View view) {
        AbstractC19074t.m100208f(backupKeySetupView, "this$0");
        EnumC11021b enumC11021b = backupKeySetupView.f55685U0;
        if (enumC11021b == EnumC11021b.f55687r) {
            BaseSetupZaloCloudView.m77746xM(backupKeySetupView, EnumC19985o.f98297z, null, 2, null);
        } else if (enumC11021b == EnumC11021b.f55688s) {
            BaseSetupZaloCloudView.m77746xM(backupKeySetupView, EnumC19985o.f98296y, null, 2, null);
        }
        C26676b.f126324a.m136967F(backupKeySetupView.f55685U0, BaseSetupZaloCloudView.m77745vM(backupKeySetupView, false, 1, null));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putInt("STATE_CURRENT_TYPE", this.f55685U0.m57579c());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        Context context;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null || (context = getContext()) == null) {
            return;
        }
        actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudSetUpSelectPwd";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.backup_key_setup_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
        super.mo57576lM(bundle);
        EnumC11021b.a aVar = EnumC11021b.Companion;
        int i11 = 0;
        if (bundle != null) {
            i11 = bundle.getInt("STATE_CURRENT_TYPE", 0);
        }
        this.f55685U0 = aVar.m57580a(i11);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        Context context = getContext();
        if (context != null) {
            ListItem listItem = ((AbstractC29935n) m77756kM()).f138731Q;
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            int i11 = AbstractC23222t7.f112534M;
            appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(i11, i11));
            appCompatImageView.setImageResource(AbstractC16803z.ic_cloud_password);
            listItem.m90587c(appCompatImageView);
            ListItem listItem2 = ((AbstractC29935n) m77756kM()).f138732R;
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
            int i12 = AbstractC23222t7.f112534M;
            appCompatImageView2.setLayoutParams(new ViewGroup.LayoutParams(i12, i12));
            appCompatImageView2.setImageResource(AbstractC16803z.ic_64_digit);
            listItem2.m90587c(appCompatImageView2);
        }
        ((AbstractC29935n) m77756kM()).f138733S.setOnClickListener(new View.OnClickListener() { // from class: o40.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupKeySetupView.m57570CM(BackupKeySetupView.this, view);
            }
        });
        ((AbstractC29935n) m77756kM()).f138734T.setOnClickListener(new View.OnClickListener() { // from class: o40.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupKeySetupView.m57571DM(BackupKeySetupView.this, view);
            }
        });
        ((AbstractC29935n) m77756kM()).f138730P.setOnClickListener(new View.OnClickListener() { // from class: o40.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupKeySetupView.m57572EM(BackupKeySetupView.this, view);
            }
        });
        m57569BM(this.f55685U0);
    }
}
