package com.example.matrimony.utilis;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/matrimony/utilis/CommonListener;", "", "ProfileInterestInterface", "app_debug"})
public abstract interface CommonListener {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/example/matrimony/utilis/CommonListener$ProfileInterestInterface;", "", "onProfileClick", "", "position", "", "onProfileMark", "interested", "", "app_debug"})
    public static abstract interface ProfileInterestInterface {
        
        public abstract void onProfileMark(boolean interested, int position);
        
        public abstract void onProfileClick(int position);
    }
}