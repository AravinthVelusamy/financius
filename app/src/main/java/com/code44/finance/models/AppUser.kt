package com.code44.finance.models

typealias UserId = String

data class AppUser(val userId: UserId)

data class AppUserValues(val hasMigrated: Boolean, val hasSeenLogin: Boolean)