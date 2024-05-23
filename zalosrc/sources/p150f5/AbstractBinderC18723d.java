package p150f5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import p504s5.AbstractBinderC26134b;
import p504s5.AbstractC26135c;

/* renamed from: f5.d */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18723d extends AbstractBinderC26134b implements InterfaceC18724e {
    public AbstractBinderC18723d() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // p504s5.AbstractBinderC26134b
    /* renamed from: W4 */
    protected final boolean mo98724W4(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return false;
                    }
                    Status status = (Status) AbstractC26135c.m134501a(parcel, Status.CREATOR);
                    AbstractC26135c.m134502b(parcel);
                    mo98720A4(status);
                } else {
                    Status status2 = (Status) AbstractC26135c.m134501a(parcel, Status.CREATOR);
                    ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) AbstractC26135c.m134501a(parcel, ModuleInstallIntentResponse.CREATOR);
                    AbstractC26135c.m134502b(parcel);
                    mo98721L0(status2, moduleInstallIntentResponse);
                }
            } else {
                Status status3 = (Status) AbstractC26135c.m134501a(parcel, Status.CREATOR);
                ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) AbstractC26135c.m134501a(parcel, ModuleInstallResponse.CREATOR);
                AbstractC26135c.m134502b(parcel);
                mo98722Q3(status3, moduleInstallResponse);
            }
        } else {
            Status status4 = (Status) AbstractC26135c.m134501a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) AbstractC26135c.m134501a(parcel, ModuleAvailabilityResponse.CREATOR);
            AbstractC26135c.m134502b(parcel);
            mo98723T3(status4, moduleAvailabilityResponse);
        }
        return true;
    }
}
