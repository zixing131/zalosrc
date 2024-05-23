package vg;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.text.TextUtils;
import au.AbstractC2373t;
import com.zing.zalo.crashhandler.C7919a;
import com.zing.zalocore.CoreUtility;
import fm0.InterfaceC19025b;
import ho0.AbstractC20110a;
import java.util.List;
import li.AbstractC22490a;
import p161fg.C18922m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import th.AbstractC26681b;

/* renamed from: vg.u3 */
/* loaded from: classes.dex */
public class C28200u3 implements InterfaceC19025b {
    @Override // fm0.InterfaceC19024a
    /* renamed from: a */
    public void mo100074a(Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            C7919a.m40926l(th2);
            AbstractC20110a.m104542k(8, "submitSilentException", th2);
        } catch (Exception unused) {
        }
    }

    @Override // fm0.InterfaceC19024a
    /* renamed from: b */
    public String mo100075b() {
        return AbstractC23309i.m120926F4();
    }

    @Override // fm0.InterfaceC19025b
    /* renamed from: c */
    public void mo100082c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            AbstractC22490a.m116281d(str + ": " + str2);
            AbstractC20110a.m104542k(8, "putExtraDataSilentException: %s-%s", str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // fm0.InterfaceC19024a
    /* renamed from: d */
    public String mo100076d() {
        return "";
    }

    @Override // fm0.InterfaceC19024a
    /* renamed from: e */
    public boolean mo100077e() {
        return AbstractC23304d.f113427q1.get();
    }

    @Override // fm0.InterfaceC19024a
    /* renamed from: f */
    public String mo100078f() {
        return AbstractC2373t.m12408f();
    }

    @Override // fm0.InterfaceC19024a
    /* renamed from: g */
    public String mo100079g() {
        return AbstractC2373t.m12405c();
    }

    @Override // fm0.InterfaceC19024a
    /* renamed from: h */
    public boolean mo100080h() {
        if (AbstractC26681b.f126356a && C18922m.m99141t().m99163x()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:            if (r0.getClassName().trim().equals("com.zing.zalo.ui.RetryMsgPopupActivity") == false) goto L19;     */
    @Override // fm0.InterfaceC19024a
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo100081i() {
        ComponentName componentName;
        int i11;
        int i12;
        ComponentName componentName2;
        ComponentName componentName3;
        ComponentName componentName4;
        ComponentName componentName5;
        ComponentName componentName6;
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) CoreUtility.getAppContext().getSystemService("activity")).getRunningTasks(1024);
        if (!runningTasks.isEmpty()) {
            String packageName = CoreUtility.getAppContext().getPackageName();
            int size = runningTasks.size();
            for (int i13 = 0; i13 < size; i13++) {
                ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(i13);
                componentName = runningTaskInfo.baseActivity;
                if (packageName.equals(componentName.getPackageName())) {
                    i11 = runningTaskInfo.numActivities;
                    if (i11 != 0) {
                        i12 = runningTaskInfo.numActivities;
                        if (i12 == 1) {
                            componentName3 = runningTaskInfo.topActivity;
                            if (!componentName3.getClassName().trim().equals("com.zing.zalo.ui.MessagePopupActivity")) {
                                componentName4 = runningTaskInfo.topActivity;
                                if (!componentName4.getClassName().trim().equals("com.zing.zalo.ui.ZaloUserPopupActivity")) {
                                    componentName5 = runningTaskInfo.topActivity;
                                }
                            }
                            return 1;
                        }
                        componentName2 = runningTaskInfo.topActivity;
                        if (componentName2.getClassName().trim().equals("com.zing.zalo.ui.MessageHintSuggestActivity")) {
                            return 1;
                        }
                        return 2;
                    }
                    return 0;
                }
                if (i13 == 0) {
                    if (!AbstractC26681b.f126356a || !C18922m.m99141t().m99163x()) {
                        componentName6 = runningTaskInfo.topActivity;
                        if (!componentName6.getPackageName().equals(CoreUtility.getAppContext().getPackageName())) {
                            return 0;
                        }
                    } else {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
