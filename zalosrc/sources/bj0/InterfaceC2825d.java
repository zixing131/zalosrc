package bj0;

import fn0.AbstractC19074t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import lj0.C22501b;

@Retention(RetentionPolicy.SOURCE)
/* renamed from: bj0.d */
/* loaded from: classes7.dex */
public @interface InterfaceC2825d {
    public static final a Companion = a.f11308a;

    /* renamed from: bj0.d$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f11308a = new a();

        private a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
        /* renamed from: a */
        public final int m13653a(String str) {
            AbstractC19074t.m100208f(str, "mode");
            switch (str.hashCode()) {
                case 243251913:
                    if (str.equals("immediate_with_time_proration")) {
                        return 1;
                    }
                    new C22501b().mo104551d("Unknown ZProration mode: " + str + ". Use default ReplacementMode: UNKNOWN_REPLACEMENT_MODE", new Object[0]);
                    return 0;
                case 647890911:
                    if (str.equals("deferred")) {
                        return 6;
                    }
                    new C22501b().mo104551d("Unknown ZProration mode: " + str + ". Use default ReplacementMode: UNKNOWN_REPLACEMENT_MODE", new Object[0]);
                    return 0;
                case 1119723894:
                    if (str.equals("immediate_and_charge_prorated_price")) {
                        return 2;
                    }
                    new C22501b().mo104551d("Unknown ZProration mode: " + str + ". Use default ReplacementMode: UNKNOWN_REPLACEMENT_MODE", new Object[0]);
                    return 0;
                case 1180234638:
                    if (str.equals("immediate_and_charge_full_price")) {
                        return 5;
                    }
                    new C22501b().mo104551d("Unknown ZProration mode: " + str + ". Use default ReplacementMode: UNKNOWN_REPLACEMENT_MODE", new Object[0]);
                    return 0;
                case 1377026220:
                    if (str.equals("unknown_subscription_upgrade_downgrade_policy")) {
                        return 0;
                    }
                    new C22501b().mo104551d("Unknown ZProration mode: " + str + ". Use default ReplacementMode: UNKNOWN_REPLACEMENT_MODE", new Object[0]);
                    return 0;
                case 1579681515:
                    if (str.equals("immediate_without_proration")) {
                        return 3;
                    }
                    new C22501b().mo104551d("Unknown ZProration mode: " + str + ". Use default ReplacementMode: UNKNOWN_REPLACEMENT_MODE", new Object[0]);
                    return 0;
                default:
                    new C22501b().mo104551d("Unknown ZProration mode: " + str + ". Use default ReplacementMode: UNKNOWN_REPLACEMENT_MODE", new Object[0]);
                    return 0;
            }
        }
    }
}
