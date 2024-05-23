package p416p5;

/* renamed from: p5.f */
/* loaded from: classes2.dex */
public enum EnumC24643f {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError");


    /* renamed from: p */
    private final String f118570p;

    EnumC24643f(String str) {
        this.f118570p = str;
    }

    /* renamed from: b */
    public static boolean m128182b(EnumC24643f enumC24643f) {
        if (!BAD_AUTHENTICATION.equals(enumC24643f) && !CAPTCHA.equals(enumC24643f) && !NEED_PERMISSION.equals(enumC24643f) && !NEED_REMOTE_CONSENT.equals(enumC24643f) && !NEEDS_BROWSER.equals(enumC24643f) && !USER_CANCEL.equals(enumC24643f) && !DEVICE_MANAGEMENT_REQUIRED.equals(enumC24643f) && !DM_INTERNAL_ERROR.equals(enumC24643f) && !DM_SYNC_DISABLED.equals(enumC24643f) && !DM_ADMIN_BLOCKED.equals(enumC24643f) && !DM_ADMIN_PENDING_APPROVAL.equals(enumC24643f) && !DM_STALE_SYNC_REQUIRED.equals(enumC24643f) && !DM_DEACTIVATED.equals(enumC24643f) && !DM_REQUIRED.equals(enumC24643f) && !THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC24643f) && !DM_SCREENLOCK_REQUIRED.equals(enumC24643f)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final EnumC24643f m128183c(String str) {
        EnumC24643f enumC24643f = null;
        for (EnumC24643f enumC24643f2 : values()) {
            if (enumC24643f2.f118570p.equals(str)) {
                enumC24643f = enumC24643f2;
            }
        }
        return enumC24643f;
    }
}
