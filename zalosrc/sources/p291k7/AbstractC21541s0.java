package p291k7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* renamed from: k7.s0 */
/* loaded from: classes3.dex */
public abstract class AbstractC21541s0 {

    /* renamed from: a */
    private static final C21536q1 f104576a = new C21536q1("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m111203a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        String m111200a = AbstractC21538r0.m111200a(signature.toByteArray());
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(m111200a)) {
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(m111200a)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                } else {
                    f104576a.m111198e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
