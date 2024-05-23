package q20;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import fn0.AbstractC19074t;

/* renamed from: q20.w */
/* loaded from: classes5.dex */
public final class C25100w {

    /* renamed from: a */
    public static final C25100w f120572a = new C25100w();

    private C25100w() {
    }

    /* renamed from: a */
    public final Vibrator m130168a(Context context, long j11) {
        Vibrator vibrator;
        VibrationEffect createOneShot;
        AbstractC19074t.m100208f(context, "context");
        C25078a c25078a = C25078a.f120479a;
        if (c25078a.m130004f()) {
            Object systemService = context.getSystemService("vibrator_manager");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            vibrator = AbstractC25098u.m130166a(systemService).getDefaultVibrator();
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            AbstractC19074t.m100206d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            vibrator = (Vibrator) systemService2;
        }
        AbstractC19074t.m100205c(vibrator);
        if (c25078a.m130001c()) {
            createOneShot = VibrationEffect.createOneShot(j11, -1);
            vibrator.vibrate(createOneShot);
        } else {
            vibrator.vibrate(j11);
        }
        return vibrator;
    }
}
