package fc0;

import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import og0.C24252c;
import og0.EnumC24251b;
import p205hc.AbstractC19962a;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p479rc.C25724a;
import si.C26263i;
import tg0.C26676b;

/* renamed from: fc0.b */
/* loaded from: classes6.dex */
public final class C18870b extends AbstractC19962a implements InterfaceC18875g {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private final C24720a f94198t;

    /* renamed from: u */
    private final C25724a f94199u;

    /* renamed from: v */
    private TargetBackupInfo f94200v;

    /* renamed from: fc0.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18870b(InterfaceC18876h interfaceC18876h, C24720a c24720a, C25724a c25724a) {
        super(interfaceC18876h);
        AbstractC19074t.m100208f(interfaceC18876h, "mvpView");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        this.f94198t = c24720a;
        this.f94199u = c25724a;
        this.f94200v = C26263i.m135058w();
    }

    @Override // fc0.InterfaceC18875g
    /* renamed from: X9 */
    public void mo98892X9() {
        if (this.f94200v != null) {
            if (!this.f94198t.m128405V()) {
                ((InterfaceC18876h) m103742Dp()).mo77704ck();
                return;
            }
            TargetBackupInfo targetBackupInfo = this.f94200v;
            AbstractC19074t.m100205c(targetBackupInfo);
            int m40953i = targetBackupInfo.m40953i();
            if (m40953i != 2) {
                if (m40953i != 3) {
                    ((InterfaceC18876h) m103742Dp()).mo77704ck();
                    return;
                } else {
                    ((InterfaceC18876h) m103742Dp()).mo77706w2();
                    return;
                }
            }
            ((InterfaceC18876h) m103742Dp()).mo77705h4();
            return;
        }
        int m89839i = AbstractC23306f.m120643a2().m89839i();
        if (m89839i != 2) {
            if (m89839i != 3) {
                C26676b.m136957g("SMLZCloudRestore", "encryption type invalid", null, 4, null);
                return;
            } else {
                ((InterfaceC18876h) m103742Dp()).mo77706w2();
                return;
            }
        }
        ((InterfaceC18876h) m103742Dp()).mo77705h4();
    }

    @Override // fc0.InterfaceC18875g
    /* renamed from: le */
    public boolean mo98893le() {
        if (!mo98896yl() && !mo98895wi()) {
            return true;
        }
        return false;
    }

    @Override // fc0.InterfaceC18875g
    /* renamed from: vl */
    public boolean mo98894vl() {
        if (this.f94200v == null || !mo98895wi() || !this.f94199u.m132668G()) {
            return false;
        }
        return true;
    }

    @Override // fc0.InterfaceC18875g
    /* renamed from: wi */
    public boolean mo98895wi() {
        return C24252c.f117152a.m126600f(EnumC24251b.f117148s);
    }

    @Override // fc0.InterfaceC18875g
    /* renamed from: yl */
    public boolean mo98896yl() {
        return C24252c.f117152a.m126600f(EnumC24251b.f117146q);
    }
}
